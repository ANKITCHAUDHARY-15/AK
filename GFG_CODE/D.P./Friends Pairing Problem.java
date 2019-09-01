import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 //code
	    int mod=1000000007;
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        int n=Integer.parseInt(br.readLine());
	        //String str[]=br.readLine().trim().split(" ");
	        long dp[]=new long[n+1];
	        for(int i=0;i<=n;i++){
	            if(i<=2){
	                dp[i]=i;
	            }
	            else{
	                dp[i]=(dp[i-1]+((i-1)*dp[i-2])%mod)%mod;
	            }
	        }
	        System.out.println(dp[n]);
	        
	   }
	 
	 }
}
