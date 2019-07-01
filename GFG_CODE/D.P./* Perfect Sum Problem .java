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
	        String str[]=br.readLine().trim().split(" ");
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=Integer.parseInt(str[i]);
	        }
	        int sum=Integer.parseInt(br.readLine());
	        int dp[][]=new int[n+1][sum+1];
	        for(int i=1;i<=n;i++){
	            for(int j=0;j<=sum;j++){
	                if(j==0){
	                    dp[i][j]=1;
	                    continue;
	                }
	                else if(j==arr[i-1]){
	                    dp[i][j]++;
	                }
	                if(dp[i-1][j]!=0){
	                    dp[i][j]+=dp[i-1][j];
	                    if(arr[i-1]+j<=sum){
	                        dp[i][j+arr[i-1]]+=dp[i-1][j];
	                    }
	                }
	            }
	        }
	        /*for(int i=0;i<=n;i++)
	           System.out.println(Arrays.toString(dp[i]));*/
	       System.out.println(dp[n][sum]);
	        
	   }
	 
	 }
}
