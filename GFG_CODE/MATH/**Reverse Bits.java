/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long n=sc.nextLong();
		    int bit=31;
		    long rev=0;
		    for(int i=31;i>=0;i--){
		        if((n&1)==1){
		            rev+=(long)Math.pow(2,i);
		        }
		        n=n>>1;
		    }
		    System.out.println(rev);
		}
	}
}
