class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0 ;
        for(int j = 0 ; j < nums.length ; j++){
        if(nums[j] != nums[count])
        {
            count++;
            nums[count] = nums[j];
        }

    }
    return count+1;
}
}