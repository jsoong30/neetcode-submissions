class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> answer = new HashMap<>();

        for (String st : strs) {
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            answer.computeIfAbsent(sorted, k -> new ArrayList<>()).add(st);
        }

        return new ArrayList<>(answer.values());
    }
}
