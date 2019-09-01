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
	        
	        String str[]=br.readLine().trim().split(" ");
	        int n1=Integer.parseInt(str[0]);
	        int n2=Integer.parseInt(str[1]);
	        int n3=Integer.parseInt(str[2]);
	        str=br.readLine().trim().split(" ");
	        String s1=str[0];
	        String s2=str[1];
	        String s3=str[2];
	        int dp[][][]=new int[n1+1][n2+1][n3+1];
	        for(int i=0;i<=n1;i++){
	            for(int j=0;j<=n2;j++){
	                for(int k=0;k<=n3;k++){
	                    if(i==0 || j==0 || k==0){
	                        dp[i][j][k]=0;
	                    }
	                    else if(s1.charAt(i-1)==s2.charAt(j-1)&& s2.charAt(j-1)==s3.charAt(k-1)) {
	                        dp[i][j][k]=dp[i-1][j-1][k-1]+1;
	                    }
	                    else{
	                        dp[i][j][k]=Math.max(dp[i][j][k-1],Math.max(dp[i][j-1][k],dp[i-1][j][k]));
	                    }
	                }
	            }
	        }
	        System.out.println(dp[n1][n2][n3]);
	        
	   }
	 
	 }
}
