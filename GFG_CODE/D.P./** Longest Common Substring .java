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
	        String str1=br.readLine().trim();
	        String str2=br.readLine().trim();
	        int dp[][]=new int[n1+1][n2+1];
	        int max=0;
	        for(int i=0;i<n1+1;i++){
	             for(int j=0;j<n2+1;j++){
	                 if(i==0 || j==0){
	                     dp[i][j]=0;
	                 }
	                 else{
	                     if(str1.charAt(i-1)==str2.charAt(j-1)){
	                         dp[i][j]=dp[i-1][j-1]+1;
	                         if(dp[i][j]>max){
	                             max=dp[i][j];
	                         }
	                     }
	                     else{
	                         dp[i][j]=0;//Math.max(dp[i-1][j],dp[i][j-1]);
	                     }
	                 }
	             }
	             
	        }
	        /*for(int i=0;i<n1+1;i++){
	            for(int j=0;j<n2+1;j++){
	                System.out.print(dp[i][j]+" ");
	            }
	            System.out.println();
	        }*/
	        System.out.println(max);
	        
	   }
	 
	 }
}
