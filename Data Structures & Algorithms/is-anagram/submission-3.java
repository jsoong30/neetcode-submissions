class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counts = new HashMap<>();
        HashMap<Character, Integer> countt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (counts.containsKey(s.charAt(i))) {
                counts.put(s.charAt(i), counts.get(s.charAt(i))+1);
            } else {
                counts.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (countt.containsKey(t.charAt(i))) {
                countt.put(t.charAt(i), countt.get(t.charAt(i))+1);
            } else {
                countt.put(t.charAt(i), 1);
            }
        }
        return counts.equals(countt);
    }
}
