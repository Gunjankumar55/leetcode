class Solution {
    public void sortColors(int[] nums) {
        int  size = nums.length;
        int [] arr = new int[3];
        for(int i = 0 ; i < size ; i ++){
            if(nums[i] == 0){
                arr[0]++;
            }
            else if(nums[i] == 1){
                arr[1]++;
            }
            else{
                arr[2]++;
            }
        }
        int index =0;
        for(int i = 0 ; i < arr[0] ; i++){
            nums[index] = 0;
            index++;
        }
        for(int i = 0 ; i < arr[1] ; i++){
            nums[index] = 1;
            index++;
        }
        for(int i = 0 ; i < arr[2] ; i++){
            nums[index] = 2;
            index++;
        }

    }
}