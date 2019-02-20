/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    int i=sc.nextInt();
		    int r=sc.nextInt();
		    n=n>>i-1;
		    int count=0;
		    for(int j=0;j<r-i+1;j++){
		        if((n&1)==0){
		            count++;
		        }
		        n=n>>1;
		    }
		    System.out.println(count);
		}
	}
}
