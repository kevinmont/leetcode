class Solution {
    public int removeDuplicates(int[] nums) {
        // nums = [1,1,2], nums = [0,0,1,1,1,2,2,3,3,4]
        // current = 0; next = 0 +1;
        // while next < nums.length;
        // nums[current] == nums[next]
        //   next = next+ 1; = 2;
        // nums[current] != nums[next] //
        //  current++; 
        //  nums[current] = nums[next]
        //  next ++;
        // return current;
        int current = 0, next = 1;
        while (next < nums.length) {
            if (nums[current] == nums[next]) {
                next++;
            } else {
                nums[++current] = nums[next++];
            }
        }
        return current +1;

    }
}