class GfG{
    boolean interLeave(String a,String b,String c,int i,int j,int k,int dp[][]){
        if(i==a.length() && j==b.length() && k==c.length()){
            return true;
        }
        if(dp[i][j]!=0){
            return dp[i][j]==1?true:false;
        }
        boolean res=false;
        if(i<a.length() && a.charAt(i)==c.charAt(k)){
            res=interLeave(a,b,c,i+1,j,k+1,dp);
        }
        if(j<b.length() && b.charAt(j)==c.charAt(k)){
            res=res || interLeave(a,b,c,i,j+1,k+1,dp);
        }
        dp[i][j]=res?1:-1;
        return res;
        
    }
	public boolean isInterLeave(String a,String b,String c)
	{
            //Your code here
            if(a.length()+b.length()!=c.length()){
                return false;
            }
            int dp[][]=new int[a.length()+1][b.length()+1];
            return interLeave(a,b,c,0,0,0,dp);
	}
}
