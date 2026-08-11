class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tar = target - nums[i];
            if (num.containsKey(tar)) {
                int[] sorted = {i, num.get(tar)};
                Arrays.sort(sorted);
                return sorted;
            } else {
                num.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
