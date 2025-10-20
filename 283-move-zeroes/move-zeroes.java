class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int [] arr = new int[len];
        int k = 0 ;
        for(int i = 0 ; i < len ; i ++){
            if(nums[i] != 0){
                arr[k++] = nums[i];
            }
        }
        for(int i = k ; i < len ; i ++){
            arr[k] = 0;
        }

        for(int i = 0 ; i < len ; i ++){
              nums[i] = arr[i];
        }
    }
    
}