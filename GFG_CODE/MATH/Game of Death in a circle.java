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
		    int k=sc.nextInt();
		    int arr[]=new int[n];
		    Arrays.fill(arr,1);
		    int j=0;
		    for(int i=0;i<n-1;i++){
		       for(int c=0;c<k;j++){
		           j=j%n;
		           if(arr[j]==0){
		              continue;
		           }
		           c++;
		       }
		       j--;
		       arr[j]=0;
		    }
		    for(int i=0;i<n;i++){
		        if(arr[i]!=0){
		           System.out.println(i+1); 
		        }
		    }
		    
		}
	}
}
