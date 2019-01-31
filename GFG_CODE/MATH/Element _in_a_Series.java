
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
	    int digit=1,sum=0;
	    for( int i=1;;i++){
	        sum+=Math.pow(2,i);
	        if(sum>=n){
	            break;
	        }
	        digit++;
	    }
	    sum-=Math.pow(2,digit);
	    for(int i=1;i<=digit;i++){
	        for(int j=1;j<=2;j++){
	            if(sum+Math.pow(2,digit-i)<n){
	                sum+=Math.pow(2,digit-i);
	            }
	            else{
	                if(j==1){
	                    System.out.print(4);
	                }
	                else if(j==2){
	                    System.out.print(7);
	                }
	                break;
	            }
	        }
	    }
	    System.out.println();
	}
}
