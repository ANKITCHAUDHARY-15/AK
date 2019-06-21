import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int min(int brr[],int a,int i){
         int min=brr[i];
         i++;
         while(--a>0){
             if(brr[i]<min){
                 min=brr[i];
             }
             i++;
         }
         return min;
     }
     static int findMinJump(int arr[],int brr[],int i){
          if(arr.length-i<=arr[i]){
              return 1;
          }
          else{
              int k=min(brr,arr[i],i+1);
              if(k==(int)Integer.MAX_VALUE)
                return k;
              else
                 return 1+k;
          }
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
	     int brr[]=new int[n];
	     if(arr[n-1]==0){
	         brr[n-1]=Integer.MAX_VALUE;
	     }
	     else{
	         brr[n-1]=0;
	     }
	     for(int i=arr.length-2;i>=0;i--){
	         if(arr[i]==0){
	             brr[i]=Integer.MAX_VALUE;
	         }
	         else{
	             brr[i]=findMinJump(arr,brr,i);
	         }
	     }
	    // System.out.println(Arrays.toString(brr));
	     if(brr[0]==Integer.MAX_VALUE){
	         System.out.println(-1);
	     }
	     else
	       System.out.println(brr[0]);
	 }
	 }
}
