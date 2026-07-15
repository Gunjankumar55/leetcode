class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c!='*'){
                stack.push(c);
            }
            else if(c=='*')
            {
            stack.pop();
            }
        }

         StringBuilder ans = new StringBuilder();
         while(!stack.isEmpty())
         {
            ans.append(stack.pop());
         }

         return ans.reverse().toString();
         
         
    }
}