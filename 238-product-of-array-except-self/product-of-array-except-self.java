class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int product = 1;
        left[0] = product;
        for (int i = 1; i < nums.length; i++) {
            product = left[i-1] * nums[i-1];
            left[i] = product;
        }

        product = 1;
        int[] right = new int[nums.length];
        right[nums.length -1] = product;
        for (int i = nums.length-2; i >=0; i--) {
            product = right[i+1] * nums[i+1];
            right[i] = product;
        }
        
        int [] answer = new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
            answer[i] = left[i] * right [i];
        }
        return answer;
    }
}