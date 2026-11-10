class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack();
        HashMap<Character, Character> characters = new HashMap();
        characters.put('(', ')');
        characters.put('[', ']');
        characters.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            if (characters.containsKey(s.charAt(i))) {
                parentheses.add(s.charAt(i));
            } 
            else if (!parentheses.empty() && characters.get(parentheses.peek()) == s.charAt(i)) {
                parentheses.pop();
            } else {
                return false;
            }
        }
        
        return parentheses.isEmpty();
    }
}