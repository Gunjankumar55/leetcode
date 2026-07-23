class Solution {
    public int lengthOfLastWord(String s) {
          char []  c  = s.toCharArray();
        int count = 0 ;
        int i = c.length -1 ;
        while(i >= 0 && c[i] == ' '){
            i--;
        }

        while(i >= 0 && c[i] != ' '){
            count++;
            i--;
        }
        return count;
        
    }
}