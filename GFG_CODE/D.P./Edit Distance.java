import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int Cost(String s,String ss,int i,int j,int dp[][]){
         if(i>=s.length()){
             return dp[i][j] =ss.length()-j;
         }
         if(j>=ss.length()){
             return dp[i][j] =s.length()-i;
         }
         if(dp[i][j] > 0)
                return dp[i][j];
         if(s.charAt(i)==ss.charAt(j)){
             return dp[i][j] =Cost(s,ss,i+1,j+1,dp);
         }
         return dp[i][j] =1+Math.min(Cost(s,ss,i+1,j+1,dp),Math.min(Cost(s,ss,i+1,j,dp),Cost(s,ss,i,j+1,dp)));
     }
	public static void main (String[] args) throws IOException
	 {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 //code
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        String str[]=br.readLine().trim().split(" ");
	        int p=Integer.parseInt(str[0]);
	        int q=Integer.parseInt(str[1]);
	        str=br.readLine().trim().split(" ");
	        String str1=str[0];
	        String str2=str[1];
	        //System.out.println(str1+" "+str2);
	        int cost=0;
	        int dp[][] = new int [p+1][q+1];
	        System.out.println(Cost(str1,str2,0,0,dp));
	        
	        }
	 
	 }
}
