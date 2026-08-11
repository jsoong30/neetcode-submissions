class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeroCount = 0;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                total *= nums[i];
            } else {
                zeroCount++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                if (zeroCount > 1) {
                    answer[i] = 0;
                } else if (nums[i] == 0) {
                    answer[i] = total;
                } else {
                    answer[i] = 0;
                }
            } else {
               answer[i] = total / nums[i]; 
            }
            
        }
        return answer;
    }
}  
