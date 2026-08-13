class Solution {

    public String encode(List<String> strs) {
        List<Integer> size = new ArrayList<>();
        for (String s : strs) {
            size.add(s.length());
        }
        StringBuilder encoded = new StringBuilder();
        for (int sizes : size) {
            encoded.append(sizes).append(",");
        }
        encoded.append("#");
        for (String s : strs) {
            encoded.append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<Integer> sizes = new ArrayList<>();
        List<String> res = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder size = new StringBuilder();
            while (str.charAt(i) != ',') {
                size.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(size.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
