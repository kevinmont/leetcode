class Solution {
    public int removeElement(int[] nums, int val) {
        // nums = [3,2,2,3], val = 3, [0,1,2,2,3,0,4,2] ,2  -> [0,1,4,0,3]
        // 2, nums = [2,2,_,_]
        // current = 0; tail = nums.length -1;
        // while current <= tail
        // if nums[current] == val
        //    nums[current] = nums[tail--]
        // else 
        //    current++
        // return tail + 1;

        int current = 0, tail = nums.length -1;
        while (current <= tail) {
            if (nums[current] == val) {
                nums[current] = nums[tail--];
            } else {
                current++;
            }
        }
        return tail + 1;
    }
}