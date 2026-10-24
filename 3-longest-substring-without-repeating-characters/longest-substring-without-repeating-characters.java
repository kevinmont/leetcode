import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> chars = new HashSet<>();
        int max = 0;
        int left = 0;
        // dvdf
        for (int right = 0; right < s.length(); right++) {
            
            while(chars.contains(s.charAt(right))) {
                //7max = Math.max(right - left, max); 
                chars.remove(s.charAt(left));
                left ++;
            }

            chars.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}