/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int k=sc.nextInt();
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    System.out.println(MaxProfit(arr,0,k));
		}
	}
	static int MaxProfit(int arr[],int i,int k){
	    if(i>=arr.length-1 || k<=0){
	        return 0;
	    }
	    else {
	        int profit=0;
	        //buy-sell
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[j]>arr[i]){
	                int m=arr[j]-arr[i]+MaxProfit(arr,j+1,k-1);
	                if(m>profit){
	                    profit=m;
	                }
	            }
	        }
	        int x=MaxProfit(arr,i+1,k);
	        if(x>profit){
	            profit=x;
	        }
	        return profit;
	    }
	    
	}
}
