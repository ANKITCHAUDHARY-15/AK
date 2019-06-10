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
		   for(int i=0;i<n-1;i++){
		       double l=arr[i];
		       double r=arr[i+1];
		       boolean flag=true;
		       while(l<r){
		           
		           double mid=l+(r-l)/2.0;
		           double force=0.0;
		           
		           for(int j=0;j<n;j++){
		               force+=(1/(mid-arr[j]));
		           }
		           if(Math.abs(force)<0.0000000000001){
		               System.out.printf("%.2f ",mid);
		               flag=false;
		               break;
		           }
		           else if(force>0){
		               l=mid;
		           }
		           else{
		               r=mid;
		           }
		       }
		   }
		   System.out.println();
		   
		}
	}
}
