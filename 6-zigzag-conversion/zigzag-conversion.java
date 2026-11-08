class Solution {
    public String convert(String s, int numRows) {
        // PYPAALISHIRING, 3
        // 
        // P  A   H   N
        // A PL S I I G
        // Y  I   R
        // PAHNAPLSIIGYIR
        // AB , 1
        if (s.length() <= 1 || numRows <=1) return s;

        String str = "";
        int increment = 2 * (numRows - 1);
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j <s.length(); j+= increment) {
                str += s.charAt(j);
                int diagonal = j + increment - 2 * i;
                if (i > 0 && i < numRows -1 && diagonal < s.length()) {
                    str += s.charAt(diagonal);
                }
            }
        }

        return str;
    }
}