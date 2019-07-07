class GfG
{
	static int max(int arr[],int i,int j,int dp[][]){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int x=arr[i]+Math.min(max(arr,i+1,j-1,dp),max(arr,i+2,j,dp));
        int y=arr[j]+Math.min(max(arr,i+1,j-1,dp),max(arr,i,j-2,dp));
        dp[i][j]=x>y?x:y;
        return dp[i][j];
    }
	public static int maxCoins(int A[],int n)
	{
          int dp[][]=new int[n][n];
          return max(A,0,n-1,dp);
    }
}
