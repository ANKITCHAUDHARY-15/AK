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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int count=0;
		    for(int x=1;x<=n;x++){
		        
		       int y=x-b+c;
		       if(y>=1 && y<=n){
		            int z=y-a+d;
		            if(z>=1 && z<=n){
		              int w=x-y+z;
		              if(w>=1 && w<=n)
		                    count++;
		            }
		       }
		    }
		   System.out.println(count);
		    
		}
	}
}
