class Solution {
    public int search(int[] nums, int target) {
        // [3,4,1,2], 3
        // 0
        // left = 0, right = 3, middle = 1
        // nums[middle] = 
        
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[left] <= nums[middle]) {
                if (target >= nums[left] && target < nums[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target > nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                } else {
                    right = middle -1;
                }
            }
         }
        return -1;
    }
}