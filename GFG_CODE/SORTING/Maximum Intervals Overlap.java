/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    int arr[]=new int[n];
		    int brr[]=new int[n];
		    String str1[]=br.readLine().trim().split(" ");
		    String str2[]=br.readLine().trim().split(" ");
		    for(int i=0;i<n;i++){
		        arr[i]=Integer.parseInt(str1[i]);
		        brr[i]=Integer.parseInt(str2[i]);
		    }
		    Arrays.sort(arr);
		    Arrays.sort(brr);
		    int maxcount=0,count=0,maxTime=0;
		    for(int i=0,j=0;i<n;i++){
		        count++;
		        while(j<n && brr[j]<arr[i]){
		            count--;
		            j++;
		        }
		        if(count>maxcount){
		            maxcount=count;
		            maxTime=arr[i];
		        }
		    }
		    System.out.println(maxcount+" "+maxTime);
		}
		
	}
}
