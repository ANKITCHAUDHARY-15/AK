METHOD : I

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int  solve(int arr[][],int dp[][],int x,int y){
         if(arr[0][0]==0){
             return -1;
         }
         int n=arr.length,m=arr[0].length;
         dp[0][0]=0;
         for(int i=1;i<n;i++){
             if(arr[i][0]==0){
                 break;
             }
             dp[i][0]=dp[i-1][0]+1;
         }
         for(int i=1;i<m;i++){
             if(arr[0][i]==0){
                 break;
             }
             dp[0][i]=dp[0][i-1]+1;
         }
         for(int i=1;i<n;i++){
             for(int j=1;j<m;j++){
                 if(arr[i][j]==0){
                     continue;
                 }
                 int a=Math.min(dp[i-1][j],dp[i][j-1]);
                 dp[i][j]=(a==Integer.MAX_VALUE?a:(a+1));
             }
         }
         
         
        /* for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	               System.out.print(dp[i][j]+" ") ;
	            }
	            System.out.println();
	        }*/
         
         for(int i=n-2;i>=0;i--){
             if(arr[i][m-1]==0){
                 continue;
             }
             int a=dp[i+1][m-1];
             a=(a==Integer.MAX_VALUE?a:(a+1));
             dp[i][m-1]=Math.min(a,dp[i][m-1]);
         }
         for(int i=m-2;i>=0;i--){
             if(arr[n-1][i]==0){
                 continue;
             }
             int a=dp[n-1][i+1];
             a=(a==Integer.MAX_VALUE?a:(a+1));
             dp[n-1][i]=Math.min(a,dp[n-1][i]);
         }
         for(int i=n-2;i>=0;i--){
             for(int j=m-2;j>=0;j--){
                 if(arr[i][j]==0){
                     continue;
                 }
                 int a=Math.min(dp[i+1][j],dp[i][j+1]);
                 a=(a==Integer.MAX_VALUE?a:(a+1));
                 dp[i][j]=Math.min(a,dp[i][j]);
             }
         }
         
         if(dp[x][y]==Integer.MAX_VALUE){
             return -1;
         }
         return dp[x][y];
     }
	public static void main (String[] args) throws IOException
	 {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 //code
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        String str[]=br.readLine().trim().split(" ");
	        int n=Integer.parseInt(str[0]);
	        int m=Integer.parseInt(str[1]);
	        str=br.readLine().trim().split(" ");
	        int arr[][]=new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	               arr[i][j]=Integer.parseInt(str[i*m+j]); 
	            }
	        }
	        str=br.readLine().trim().split(" ");
	        int x=Integer.parseInt(str[0]);
	        int y=Integer.parseInt(str[1]);
	        
	       /* for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	               System.out.print(arr[i][j]+" ") ;
	            }
	            System.out.println();
	        }*/
	        
	        int dp[][]=new int[n][m];
	        for(int i=0;i<n;i++)
	            Arrays.fill(dp[i],Integer.MAX_VALUE);
	        
	       System.out.println(solve(arr,dp,x,y));
	       
	       /*for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	               System.out.print(dp[i][j]+" ") ;
	            }
	            System.out.println();
	        }*/
	        
	   }
	 
	 }
}
