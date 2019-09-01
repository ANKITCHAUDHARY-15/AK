import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 //code
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        int n=Integer.parseInt(br.readLine());
	        //String str[]=br.readLine().trim().split(" ");
	        int dp[]=new int[n+1];
	        //dp[2]=1;
	        for(int i=2;i<=n;i++){
	            int ans=dp[i-1]+1;
	            if(i%2==0){
	                ans=Math.min(ans,dp[i/2]+1);
	            }
	            if(i%3==0){
	               ans=Math.min(ans,dp[i/3]+1); 
	            }
	            dp[i]=ans;
	            //arr[i]=Integer.parseInt(str[i]);
	        }
	        System.out.println(dp[n]);
	        
	   }
	 
	 }
}
