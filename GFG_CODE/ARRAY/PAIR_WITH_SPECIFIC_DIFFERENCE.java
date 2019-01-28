/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int k=sc.nextInt();
		    int x=0;
		    int sum=0;
		    while(x<n){
		        int mi=max_i(arr);
		        int temp=arr[mi];
		        arr[mi]=-10000;
		        int smi=max_i(arr);
		        if(temp-arr[smi]<k){
		           sum+=temp+arr[smi];
		            arr[smi]=-10000;
		            x++;
		        }
		        x++;
		    }
		    System.out.println(sum);
		}
	}
	static int max_i(int arr[]){
	    int max_i=0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>arr[max_i]){
	            max_i=i;
	        }
	    }
	    return max_i;
	}
}
