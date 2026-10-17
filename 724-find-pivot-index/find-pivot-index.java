class Solution {
    public int pivotIndex(int[] nums) {
        //[1] base case
        // 0 == 0
        // 0
        //
        // [1,1]
        // [0] -> 0 == 1 // false // [0, 1]
        // [1] -> 1 == 0 // false // [1, 0]

        // [1,2,1]
        // [0] -> 0 == 3 // false //[0, 1, 3]
        // [1] -> 1 == 1 // true  //[3, 1, 0] ;  == index 1==1 1
        // [2] 
        
        // [1,7,3,6,5,6]
        // prefix
        // [1, 8, 11, 17, 22, 28]
        // [28, 27, 20, 17, 11, 6]
        int[] left = new int[nums.length];
        int comulative = 0;
        for (int i=0; i< nums.length; i++) {
            comulative += nums[i];
            left[i] = comulative; 
        }

        int[] right = new int[nums.length];
        comulative = 0;
        for (int i=nums.length -1; i>=0; i--) {
            comulative += nums[i];
            right[i] = comulative; 
        }

        for (int i=0; i< nums.length; i++) {
            if (left[i] == right[i])
                return i;
        }

        return -1;
    }
}