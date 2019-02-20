/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    String[] s=br.readLine().trim().split(" ");
		    int[] rem=new int[3];
		    for(int i=0;i<n;i++){
		        int x=Integer.parseInt(s[i])%3;
		        if(x==0)
		                rem[0]++;
		        else if(x==1)
		            rem[1]++;
		        else
		            rem[2]++;
		    }
		    int count=(rem[0]*(rem[0]-1)/2)+(rem[0]*(rem[0]-1)*(rem[0]-2)/6);
		    count+= (rem[1]*(rem[1]-1)*(rem[1]-2)/6);
		    count+= (rem[2]*(rem[2]-1)*(rem[2]-2)/6);
		    count+=(rem[1]*rem[2]);
		    count+=(rem[0]*rem[1]*rem[2]);
		    System.out.println(count);
		}
	}
}
