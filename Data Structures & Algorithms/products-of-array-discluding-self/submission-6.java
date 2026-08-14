class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                continue;
            } else {
                total *= nums[i];
            }
        }
        int[] out = new int[nums.length];
        if (zeroCount > 1) {
            for (int i = 0; i < nums.length; i++) {
                out[i] = 0;
            }
        } else if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    out[i] = total;
                } else {
                    out[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                out[i] = total/nums[i];
            }
        }
        return out;
    }  
}  
