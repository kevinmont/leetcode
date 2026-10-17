class Solution {
    public int[] runningSum(int[] nums) {
        // Base case
        // [1]
        // return [1]
        // [8, 5]
        // return [8, 13]
        int comulative = 0;
        
        for (int i = 0; i< nums.length; i++) {
            comulative += nums[i];
            nums[i] = comulative;
        }

        return nums;

    }
}