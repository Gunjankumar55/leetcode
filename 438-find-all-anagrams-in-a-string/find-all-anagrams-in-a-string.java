class Solution {
    public List<Integer> findAnagrams(String s, String p)
    {
        int k = p.length();
        char pp [] = p.toCharArray();
        Arrays.sort(pp);
        String sortedp = new String(pp);
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i = 0 ; i <= s.length() - k ; i++)
        {
          String window = s.substring(i , i + k); // 3 char vala string
          char ch [] = window.toCharArray(); // 3 char seperaterd 
          Arrays.sort(ch); // 3 char sorted 
          String sortedwindow = new String(ch);  //  back to string 3 char which are sorted .

          if(sortedp.equals(sortedwindow))
          {
            ar.add(i);
          }
        }
        return ar;
    }
}