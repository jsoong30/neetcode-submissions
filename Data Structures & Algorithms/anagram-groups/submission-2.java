class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> count = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String strnew = new String(arr);
            count.putIfAbsent(strnew, new ArrayList<>());
            count.get(strnew).add(s);
        }
        return new ArrayList<>(count.values());
    }
}
