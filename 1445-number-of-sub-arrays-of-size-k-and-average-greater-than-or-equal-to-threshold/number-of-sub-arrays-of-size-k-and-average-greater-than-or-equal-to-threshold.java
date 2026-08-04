class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0 ;
        int sum  = 0;
        int count = 0;

        for(int r = 0 ;  r <= arr.length - 1; r++ )
        {
            sum += arr[r];

            if(r - left + 1 == k)
            {
                if( (sum/k) >= threshold )
                {
                    count++;
                }
                sum -= arr[left];
                left++;
            }
        }
        return count;
    }
}