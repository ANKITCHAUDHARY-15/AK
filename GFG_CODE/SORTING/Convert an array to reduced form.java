/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    String str[]=br.readLine().trim().split(" ");
		    int arr[]=new int[n];
		    int brr[]=new int[n];
		    int hrr[]=new int[1001];
		    for(int i=0;i<n;i++){
		         arr[i]=brr[i]=Integer.parseInt(str[i]);
		    }
		    Arrays.sort(brr);
		    for(int i=0;i<n;i++){
		        hrr[brr[i]]=i;
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(hrr[arr[i]]+" ");
		    }
		    
		    System.out.println();
		}
	}
}
