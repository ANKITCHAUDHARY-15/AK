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
		    /*if(n%2==0){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }*/
		    System.out.println((n-1)%2);
		}
	}
}
