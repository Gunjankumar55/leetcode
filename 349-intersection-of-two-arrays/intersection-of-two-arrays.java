class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar = new ArrayList<>();
        HashSet <Integer> hs = new HashSet<>();
    
        for(int i  : nums1)
        {
            hs.add(i);
        }
        for(int i : nums2){
            if(hs.contains(i)){
                ar.add(i);
                hs.remove(i);
            }
        }
        int a = 0 ;
        int arr [] = new int[ar.size()];
        for(int i : ar){
            arr[a++] = i;
        }
        return arr;
    }
}