class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            }
            else if(stack.peek() == c){
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
           sb.append(stack.pop()) ;
        }

        return sb.reverse().toString();
    }
}