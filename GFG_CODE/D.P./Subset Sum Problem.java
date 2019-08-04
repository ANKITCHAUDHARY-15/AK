import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static boolean check(int arr[]){
         int sum=0;
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
         }
         if((sum&1)==1){
             return false;
         }
         int n=arr.length;
         boolean dp[][]=new boolean[sum/2+1][n+1];
         for(int i=0;i<=sum/2;i++){
             dp[i][0]=false;
         }
         for(int i=0;i<=n;i++){
             dp[0][i]=true;
         }
         for(int i=1;i<=sum/2;i++){
             for(int j=1;j<=n;j++){
                 dp[i][j]=dp[i][j-1];
                 if(i>=arr[j-1]){
                     dp[i][j]=dp[i][j] || dp[i-arr[j-1]][j-1];
                 }
             }
         }
         /*for(int i=0;i<=sum/2;i++){
             for(int j=0;j<=n;j++){
                 System.out.print(dp[i][j]+" ");
             }
             System.out.println(i);
         }*/
         return dp[sum/2][n];
     }
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
	        if(check(arr)){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	        
	   }
	 
	 }
}
