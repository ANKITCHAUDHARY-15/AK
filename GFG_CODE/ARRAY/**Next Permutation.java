import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static void sort(int arr[],int i){
         int j=arr.length-1;
         while(i<j){
             swap(arr,i,j);
             i++;
             j--;
         }
     }
     static void swap(int arr[],int i,int j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
     }
     static void nextPermutation(int arr[]){
         int i=arr.length-1;
         while(i>0){
             if(arr[i-1]<arr[i]){
                 break;
             }
             i--;
         }
         if(i==0)
            return;
         i--;
         int j=arr.length-1;
         while(j>i){
             if(arr[j]>arr[i]){
                 break;
             }
             j--;
         }
         swap(arr,i,j);
         sort(arr,i+1);
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
	        nextPermutation(arr);
	        for(int i=0;i<n;i++){
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        
	   }
	 
	 }
}
