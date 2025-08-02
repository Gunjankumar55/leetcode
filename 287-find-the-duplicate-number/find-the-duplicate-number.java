class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> gunjan = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(gunjan.contains(nums[i])){
                return nums[i];

            }
            else{
                gunjan.add(nums[i]);
            }
        }       
        return -1; 
    }
}