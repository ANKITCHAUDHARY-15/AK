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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int x=a,y=b;
		    while(m>x){
		        x+=a;
		    }
		    while(m>y){
		        y+=b;
		    }
		    int temp=n;
		    while(temp%a!=0){
		        temp--;
		    }
		    int count=(temp-x+a)/a;
		    temp=n;
		    while(temp%b!=0){
		        temp--;
		    }
		    count+=(temp-y+b)/b;
		   int c=LCM(a,b);
		   temp=n;
		   int z=c;
		   while(m>z){
		       z+=c;
		   }
		   while(temp%c!=0){
		       temp--;
		   }
		   count-=(temp-z+c)/c;
		    System.out.println(count);
		    
		}
	}
	static int LCM(int a,int b){
	    int max=a;
	    if(b>a){
	        max=b;
	    }
	    int x=max;
	    while(true){
	        if(max%a==0 && max%b==0){
	            break;
	        }
	        max+=x;
	    }
	    return max;
	}
}
