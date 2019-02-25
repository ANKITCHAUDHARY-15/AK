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
		    for(int i=1;i<Math.pow(2,n);i++){
		        if((i&(i>>1))==0){
		            System.out.print(i+" ");
		        }
		        
		    }
		    System.out.println();
		}
	}
}

