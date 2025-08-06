class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currcount = 0;
        int maxcount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1)
            {
                currcount += 1;
                maxcount = Math.max(maxcount,currcount);
            }else {
                currcount = 0;
            }
        
    }return maxcount;
}
}