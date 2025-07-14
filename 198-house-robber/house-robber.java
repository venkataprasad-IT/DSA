class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        for(int i=0; i<dp.length ; i++) {
            dp[i] = -1;
        }

       return  solve(dp, 0, nums);
        
    }

    static int solve(int dp[], int ind,int[] nums){
        if(ind >= dp.length) return 0;

        if(dp[ind] != -1){
          return  dp[ind];
        }else{
            int take = nums[ind]+  solve(dp, ind+2, nums);
            int nt= solve(dp,ind+1, nums);
            return dp[ind] = Math.max(take, nt);
        }
    }
}