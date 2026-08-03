class Solution {
    public int minimumRecolors(String blocks, int k) {
        char [] ch = blocks.toCharArray();
        int left = 0 ;
        int min = k ;
        int wcount = 0 ; 
        for(int right = 0 ; right < blocks.length() ; right++)
        {
            if(ch[right] == 'W'){
                wcount++;
            }

            if(right - left + 1 == k){
                min = Math.min(min , wcount);
                if(ch[left]=='W'){
                    wcount--;
                }
                left++;
            }
            
        }
        return min;
    }
}