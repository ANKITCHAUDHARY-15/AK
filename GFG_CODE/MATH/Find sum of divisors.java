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
		    int sum=0;
		    for(int i=1;i<=n/2;i++){
		        if(n%i==0){
		            sum+=SOD(i);
		            
		        }
		    }
		    sum+=SOD(n);
		    System.out.println(sum);
		}
	}
	static int SOD(int x){
	    int sum=x;
	    for(int i=1;i<=x/2;i++){
	        if(x%i==0){
	            sum+=i;
	        }
	    }
	    return sum;
	}
}
