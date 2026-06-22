class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s = new Stack<>();

        for(int i = 0; i<operations.length; i++)
        {
        if(operations[i].equals("C")){
            s.pop();
        }
        else if(operations[i].equals("D")){
            s.push(s.peek()*2);
        }
        else if(operations[i].equals("+"))
        {
            int first = s.pop();
            int second = s.peek();
            s.push(first);
            s.push(first + second);

        }
        else{
            s.push(Integer.valueOf(operations[i]));
        }
        }
        int sum= 0;
        while(!s.isEmpty()){
            sum += s.peek();
            s.pop();
        }
        return sum;

        }
        
    }
