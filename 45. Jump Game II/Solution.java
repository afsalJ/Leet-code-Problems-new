class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        return getShortest(nums, 0, dp);
    }

    public int getShortest(int[] nums, int index, int[] dp)
    {
        if(index == nums.length -1){
            return 0;
        }
        else if(index >= nums.length){
            return 100000;
        }
        else if(dp[index]!=0){
            return dp[index];
        }
        else{
            int max = nums[index];
            int jumps = 100000;
            for(int i=max;i>0;i--){
                jumps = Math.min(jumps, 1 + getShortest(nums, index+i,dp));
            }
            return dp[index]=jumps;
        }
    }
}