class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        ArrayList <Integer> ar = new ArrayList<>();
        

        
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(int i = 0 ; i < k ; i++)
        {
            int maxkey=0;
            int maxfrq=0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet())
         {
            if(entry.getValue() > maxfrq)
            {
                maxfrq = entry.getValue();
                maxkey = entry.getKey();
         }

       
         }
         ar.add(maxkey);
         hm.remove(maxkey);
}
int arr [] = new int[ar.size()];
      for(int j = 0 ; j < ar.size() ; j++)
         {
            arr[j] = ar.get(j);
         }
         return arr;
    }
}