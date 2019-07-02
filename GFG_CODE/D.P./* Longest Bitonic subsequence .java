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
	        int in[]=new int[n];
	        in[0]=1;
	        for(int i=1;i<n;i++){
	            if(arr[i]>arr[i-1]){
	                in[i]=in[i-1]+1;
	            }
	            else{
	                in[i]=1;
	            }
	            int j=i-1;
	            while(j>=in[i]-1){
	                if(in[i]<=in[j] && arr[i]>=arr[j]){
	                    in[i]=in[j]+1;
	                    if(arr[i]==arr[j]){
	                        in[i]--;
	                    }
	                }
	                j--;
	            }
	        }
	        int de[]=new int[n];
	        de[n-1]=1;
	        for(int i=n-2;i>=0;i--){
	            if(arr[i]>arr[i+1]){
	                de[i]=de[i+1]+1;
	            }
	            else{
	                de[i]=1;
	            }
	            int j=i+1;
	            while(j<=n-de[i]){
	                if(de[i]<=de[j] && arr[i]>=arr[j]){
	                    de[i]=de[j]+1;
	                    if(arr[i]==arr[j]){
	                        de[i]--;
	                    }
	                }
	                j++;
	            }
	        }
	        int len=0;
	        for(int i=0;i<n;i++){
	            if(in[i]+de[i]-1>len){
	                len=in[i]+de[i]-1;
	            }
	        }
	        System.out.println(len);
	   }
	 
	 }
}
