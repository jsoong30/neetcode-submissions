class Solution {
    public int search(int[] nums, int target) {
        int p1 = 0;
        int p2 = nums.length - 1;
        return recursiveSearch(nums, p1, p2, target);
    }

    private int recursiveSearch(int[] num, int start, int end, int target) {
        if (end < start) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (num[mid] == target) {
            return mid;
        } else if (num[mid] < target) {
            mid = mid + 1;
            return recursiveSearch(num, mid, end, target);
        } else {
            mid = mid - 1;
            return recursiveSearch(num, start, mid, target);
        }


    }

}
