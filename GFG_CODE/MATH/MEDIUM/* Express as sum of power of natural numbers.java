/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int n=sc.nextInt();
		    if(n!=1){
		        ArrayList<Integer> al=new ArrayList<Integer>();
		        for(int i=1;Math.pow(i,n)<=x;i++){
		            al.add((int)Math.pow(i,n));
		        }
		        System.out.println(Count(x,n,0,0,al));
		        
		    }
		   else{
		       System.out.println((x+1)/2);
		   }
		}
	}
	static int Count(int x,int n,int i,int sum,ArrayList<Integer> al){
	    if(sum==x){
	        return 1;
	    }
	    else if(sum>x || i>=al.size()){
	        return 0;
	    }
	    else{
	        int s=al.get(i);
	        return Count(x,n,i+1,sum+s,al)+Count(x,n,i+1,sum,al);
	        
	    }
	}
}

