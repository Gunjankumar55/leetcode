class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        int arr[] = {-1,-1};
        int ans = -1 ;
        

        while(left <= right)
        { 
            int mid = (left + right) /2 ;
            if(target == nums[mid])
            {
                ans = mid;
                right = mid -1 ;
            }
            else if (target > nums[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid -1;
            }
        }
        arr[0] = ans;
         left = 0;
         right = nums.length-1;
         ans = -1 ;

        while(left <= right)
        { 
            int mid = (left + right) /2 ;
            if(target == nums[mid])
            {
                ans = mid;
                left = mid +1 ;
            }
            else if (target > nums[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid -1;
            }
        }
        arr[1] = ans;

        return arr;
    }
}