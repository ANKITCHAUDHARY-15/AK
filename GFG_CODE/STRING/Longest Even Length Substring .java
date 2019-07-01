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
	        String str[]=br.readLine().trim().split("");
	        int arr[]=new int[str.length+1];
	        arr[0]=0;
	        arr[1]=Integer.parseInt(str[0]);
	        for(int i=2;i<=str.length;i++){
	            arr[i]=arr[i-1]+Integer.parseInt(str[i-1]);
	        }
	        int k=0;
	        for(int i=1;i<str.length;i++){
	            for(int j=i+1;j<=str.length;j+=2){
	                int tsum=arr[j]-arr[i-1];
	                int sum=arr[(j+i)/2]-arr[i-1];
	                if(tsum%2==0 && sum==tsum/2  && k<j-i+1){
	                    k=j-i+1;
	                }
	            }
	        }
	        System.out.println(k);
	        
	   }
	 
	 }
}
