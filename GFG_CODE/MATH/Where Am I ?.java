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
		    int[] position=new int[2];
		    char face='N';
		    for(int i=0;i<m;i++){
		        char ch=sc.next().charAt(0);
		        int d=sc.nextInt();
		        if((face=='N' && ch=='R')||(face=='S' && ch=='L')){
		            face='E';
		            position[1]+=d;
		        }
		        else if((face=='N' && ch=='U')||(face=='S' && ch=='D')){
		            face='N';
		            position[0]-=d;
		        }
		        else if((face=='N' && ch=='L')||(face=='S' && ch=='R')){
		            face='W';
		            position[1]-=d;
		        }
		        else if((face=='N' && ch=='D')||(face=='S' && ch=='U')){
		            face='S';
		            position[0]+=d;
		        }
		        else if((face=='E' && ch=='R')||(face=='W' && ch=='L')){
		            face='S';
		            position[0]+=d;
		        }
		        else if((face=='E' && ch=='U')||(face=='W' && ch=='D')){
		            face='E';
		            position[1]+=d;
		        }
		        else if((face=='E' && ch=='L')||(face=='W' && ch=='R')){
		            face='N';
		            position[0]-=d;
		        }
		        else if((face=='E' && ch=='D')||(face=='W' && ch=='U')){
		            face='W';
		            position[1]-=d;
		        }
		    }
		    int x=position[0];
		    int y=position[1];
		    System.out.println((int)Math.sqrt(x*x+y*y)+" "+face);
		}
	}
}
