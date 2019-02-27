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
		    for(int i=2;i<=n/2;i++){
		        if(n%i==0){
		            if(prime(i)){
		                System.out.print(i+" "+power(n,i)+" ");
		            }
		        }
		    }
		    if(prime(n)){
		                System.out.print(n+" "+power(n,n)+" ");
		            }
		    System.out.println();
		}
	}
	static boolean prime(int x){
	    for(int i=2;i<=x/2;i++){
	        if(x%i==0){
	            return false;
	        }
	    }
	    return true;
	}
	static int power(int n,int x){
	    int i=1;
	    while(n%Math.pow(x,i)==0){
	        i++;
	    }
	    return --i;
	}
}




