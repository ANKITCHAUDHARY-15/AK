/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int[][] arr=new int[3][3];
		    for(int i=0;i<3;i++){
		        for(int j=0;j<3;j++){
		            arr[i][j]=sc.nextInt();
		        }
		    }
		    for(int i=0;i<2;i++){
		        if(arr[i][i]==0){
		            if(i+1<3 && arr[i+1][i]!=0){
		                swap(arr,i,i+1);
		            }
		            else if(i+2<3 && arr[i+2][i]!=0){
		                swap(arr,i,i+2);
		            }
		            else{
		                continue;
		            }
		        }
		        int k=arr[i+1][i]/arr[i][i];
		        cal(arr,k,i,i+1);
		        if(i==0){
		            k=arr[i+2][i]/arr[i][i];
		            cal(arr,k,i,i+2);
		        }
		    
		    }
		  System.out.println(rank(arr));
		}
	}
	static int rank(int arr[][]){
	    int rank=0;
	    if(arr[2][2]!=0){
	        rank++;
	    }
	    if(arr[1][1]!=0 || arr[1][2]!=0){
	        rank++;
	    }
	    if(arr[0][0]!=0 || arr[0][1]!=0 || arr[0][2]!=0){
	        rank++;
	    }
	    return rank;
	}
	static void cal(int arr[][],int k,int p,int q){
	    for(int i=0;i<3;i++){
	        arr[q][i]-=(k*arr[p][i]);
	    }
	}
	static void swap(int arr[][],int p,int q){
	    for(int i=0;i<3;i++){
	        int temp=arr[p][i];
	        arr[p][i]=arr[q][i];
	        arr[q][i]=temp;
	    }
	}
}
