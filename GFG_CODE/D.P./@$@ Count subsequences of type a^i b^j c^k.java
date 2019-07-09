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
	        //int n=Integer.parseInt(br.readLine());
	        String str=br.readLine().trim();
	        int n=str.length();
	        int dp[][]=new int[4][n+1];
	        for(int i=0;i<4;i++){
	            for(int j=0;j<=n;j++){
	                if(j==0 || i==0){
	                    dp[i][j]=i==0?1:0;
	                }
	                else
	                  switch(i){
	                    case 1:
	                        if(str.charAt(j-1)=='a'){
	                            dp[i][j]=2*dp[i][j-1]+dp[i-1][j];
	                        }
	                        else{
	                            dp[i][j]=dp[i][j-1];
	                        }
	                        break;
	                   case 2:
	                       if(str.charAt(j-1)=='b'){
	                            dp[i][j]=2*dp[i][j-1]+dp[i-1][j];
	                        }
	                        else{
	                            dp[i][j]=dp[i][j-1];
	                        }
	                        break;
	                   case 3:
	                       if(str.charAt(j-1)=='c'){
	                            dp[i][j]=2*dp[i][j-1]+dp[i-1][j];
	                        }
	                        else{
	                            dp[i][j]=dp[i][j-1];
	                        }
	                  }
	                 
	            }
	        }
	        /*for(int i=0;i<4;i++){
	            for(int j=0;j<=n;j++){
	                System.out.print(dp[i][j]+" ");
	            }
	            System.out.println();
	        }*/
	        System.out.println(dp[3][n]);
	        
	   }
	 
	 }
}
