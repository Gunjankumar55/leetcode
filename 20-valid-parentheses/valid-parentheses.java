class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
          if(s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i)== '['){
            stack.push(s.charAt(i));
          }else if(stack.isEmpty()){
            return false;
          }

          else{
            char top = stack.peek();
            if(
                top == '(' && s.charAt(i) == ')' ||
                top == '{' && s.charAt(i) == '}' ||
                top == '[' && s.charAt(i) == ']' 
                        ) {stack.pop();}
                          else{
            return false;
          }

          }
        
  
          }
          return stack.isEmpty();
        }
        
    }
