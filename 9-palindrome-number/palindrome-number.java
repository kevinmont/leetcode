class Solution {
    public boolean isPalindrome(int x) {
        // 1
        // true
        // 12 => 12 => 21
        // / 10 => 1 -> 2
        // 21
        // 77 
        // / 10 = 7 -> 7
        // 77
        // 727
        // /100 => 100 => 7 % 27 => 27 / 10 => 2, %7 = 10 = 7;
        // 727
        // false
        // 10 
        // 10 / 10 = 1 , 0 % 10 = 0
        //01
        if (x < 0) return false;
        int v = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed == v;
    }
}