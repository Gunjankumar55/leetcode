class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean iss = true;
        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();
        int j =0 ;
        for(int i = 0 ; i < ch2.length ; i++){
            if(j < ch1.length && ch1[j]==ch2[i])
            {
                j++;
            }
            
        }
        if(j!=ch1.length){
                iss = false;
            }
            return iss;
        
    }
}