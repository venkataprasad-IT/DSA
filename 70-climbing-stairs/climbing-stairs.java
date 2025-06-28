class Solution {
    public int climbStairs(int n) {
         int dp[]= new int[n+1]; 

         dp[0]= 1;
         dp[1]= 1;
         for(int i=2; i<= n ;i++){
            dp[i] = dp[i-1]+dp[i-2];
         }
        //  for(int i=0; i<=n; i++){
        //     dp[i]= -1;
        //  } 
        return dp[n];
        //  return solve(dp, n);       
    }


    // static int solve(int[] dp, int n){
    //     if(n==1 || n==0) return 1 ;
    //     if(n<0) return 0;

    //     if(dp[n]!= -1) return dp[n];
    //     dp[n]=solve(dp, n-2)+ solve(dp, n-1);
    //     return dp[n];
    // }
}