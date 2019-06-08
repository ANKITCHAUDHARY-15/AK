/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		Long t=sc.nextLong();
		while(t-->0){
		    int n=sc.nextInt();
		    int q=sc.nextInt();
		    Long [][]arr=new Long[2][n];
		    for(int i=0;i<n;i++){
		        arr[0][i]=sc.nextLong();
		        arr[1][i]=sc.nextLong();
		    }
		    Long brr[]=new Long[q];
		    for(int i=0;i<q;i++){
		        brr[i]=sc.nextLong();
		    }
		    
		    for(int i=0;i<q;i++){
		        boolean flag=true;
		        for(int j=0;j<n;j++){
		            Long x=arr[1][j]-arr[0][j]+1;
		            if(x>=brr[i]){
		                System.out.print(arr[0][j]+brr[i]-1+" ");
		                flag=false;
		                break;
		            }
		            else{
		                brr[i]-=x;
		            }
		        }
		        if(flag){
		            System.out.print(arr[1][n-1]+brr[i]+" ");
		        }
		    }
		    System.out.println();
		    
		}
	}
}
