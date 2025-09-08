class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedno = n * (n + 1 ) / 2;
        int arraysum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            arraysum += nums[i];
        }
        return  expectedno - arraysum;
    }
}