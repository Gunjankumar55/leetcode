class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums)
        {
        hs.add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i <= nums.length ; i++)
        {
            if(hs.contains(i)){
                continue;
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}