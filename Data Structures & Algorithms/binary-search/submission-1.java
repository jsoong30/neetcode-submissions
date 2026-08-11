class Solution {
    public int search(int[] nums, int target) {
        int p1 = 0;
        int p2 = nums.length;
        int mid = (p1 + p2) / 2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target){
                p1 = mid;
                mid = (p1 + p2) / 2;
            } else {
                p2 = mid;
                mid = (p1 + p2) / 2;
            }
        }

        return -1;
    }
}
