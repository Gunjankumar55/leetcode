class Solution {
    public boolean isvow(char c)
    { 
        boolean isvow = false;
        if (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            isvow = true;
        }
        return isvow;
    }
    public String reverseVowels(String s) {
        
        char [] ch = s.toCharArray();
        int left =  0 ;
        int right = ch.length -1;

        while(left < right)
        {
            while(left < right && !isvow(ch[left])) {
            left++;
            }
            while(left < right && !isvow(ch[right])) {
            right--;
            }

            
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
return new String(ch);
        
        
    }
}