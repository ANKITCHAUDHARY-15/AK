/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int r=sc.nextInt();
	        int g=sc.nextInt();
	        int b=sc.nextInt();
	        System.out.println(NumberOfWays(r,g,b,'-'));
	    }
	}
	static int NumberOfWays(int r,int g,int b,char ch){
	    if(r==0 && g==0 && b==0){
	        return 1;
	    }
	    else if(Check(r,g,b)){
	        return 0;
	    }
	    else{
	       if(ch=='r')
	           return NumberOfWays(r,g-1,b,'g')+NumberOfWays(r,g,b-1,'b');
	       else if(ch=='g')
	            return NumberOfWays(r-1,g,b,'r')+NumberOfWays(r,g,b-1,'b');
	       else if(ch=='b')
	            return NumberOfWays(r-1,g,b,'r')+NumberOfWays(r,g-1,b,'g');
	       else 
	            return NumberOfWays(r-1,g,b,'r')+NumberOfWays(r,g-1,b,'g')+NumberOfWays(r,g,b-1,'b');
	    }
      }
    static boolean Check(int r,int g,int b){
         int []arr={r,g,b};
         for(int i=1;i<3;i++){
             if(arr[i]<arr[i-1]){
                 int tamp=arr[i];
                 arr[i]=arr[i-1];
                 arr[i-1]=tamp;
                 
             }
         }
         return arr[0]+arr[1]<arr[2]-1;
    }
}
