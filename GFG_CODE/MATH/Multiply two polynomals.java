/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int poly1[]=new int[m];
		    int poly2[]=new int[n];
		    for(int i=0;i<m;i++){
		        poly1[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		        poly2[i]=sc.nextInt();
		    }
		    int[] result=new int[m+n-1];
		    for(int i=0;i<m;i++){
		        
		        for(int j=0;j<n;j++){
		            result[i+j]+=(poly1[i]*poly2[j]);
		        }
		    }
		    for(int i=0;i<m+n-1;i++){
		        System.out.print(result[i]+" ");
		    }
		    System.out.println();
		    
		}
	}
}
