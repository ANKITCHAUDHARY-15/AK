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
		    nthNumber(n);
		}
	}
	static void nthNumber(int n){
	    int d=0,num=0;
	    while(num<n){
	        d++;
	        num+=Math.pow(4,d);
	        
	    }
	    num-=Math.pow(4,d);
	    for(int i=1;i<=d;i++){
	        for(int j=1;j<=4;j++){
	            if(Math.pow(4,d-i)+num<n){
	                num+=Math.pow(4,d-i);
	            }
	            else{
	                if(j==1){
	                    System.out.print(2);
	                }
	                else if(j==2){
	                    System.out.print(3);
	                }
	                else if(j==3){
	                    System.out.print(5);
	                }
	                else if(j==4){
	                    System.out.print(7);
	                }
	                break;
	            }
	        }
	    }
	    System.out.println();
	}
}
