class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList <Integer> ar1 = new ArrayList <>();
        ArrayList <Integer> ar2 = new ArrayList <>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]>0){
                ar1.add(nums[i]);
            }
            if(nums[i]<0){
                ar2.add(nums[i]);
            }
        }
        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i+=2)
        {
            nums[i] = ar1.get(j);
            nums[i+1] = ar2.get(j);
            j++;

        }
        return nums;
    }
}