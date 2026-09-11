class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) 
        {
             if(entry.getValue()==2){
                ar.add(entry.getKey());
             }
        }
        return ar;
    }
}