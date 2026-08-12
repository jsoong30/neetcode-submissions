class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<int[]> count = new ArrayList<>();
        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            count.add(new int[] {x.getValue(), x.getKey()});
        }
        count.sort((a,b) -> b[0] - a[0]);
        int[] sol = new int[k];
        for (int i = 0; i < k; i++) {
            sol[i] = count.get(i)[1];
        }
        return sol;
        
    }
}
