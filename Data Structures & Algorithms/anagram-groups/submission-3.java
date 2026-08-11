class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> count = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String newS = new String(arr);
            count.putIfAbsent(newS, new ArrayList<>());
            count.get(newS).add(s);
        }
        return new ArrayList<>(count.values());
    }
}
