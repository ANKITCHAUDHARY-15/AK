/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String str[]=br.readLine().trim().split(" ");
		    int n=Integer.parseInt(str[0]);
		    int m=Integer.parseInt(str[1]);
		    str=br.readLine().trim().split(" ");
		    int arr[]=new int[n];
		    int brr[]=new int[m];
		    for(int i=0;i<n;i++){
		        arr[i]=Integer.parseInt(str[i]);
		    }
		    str=br.readLine().trim().split(" ");
		    for(int i=0;i<m;i++){
		        brr[i]=Integer.parseInt(str[i]);
		    }
		    int max=Arrays.stream(arr).max().getAsInt();
		    //System.out.println(max);
		    int freq[]=new int[max+1];
		    for(int i=0;i<n;i++){
		        freq[arr[i]]++;
		    }
		    for(int i=0;i<m;i++){
		        for(int j=freq[brr[i]];j>0;j--){
		            System.out.print(brr[i]+" ");
		        }
		       freq[brr[i]]=0; 
		    }
		    for(int i=0;i<=max;i++){
		        for(int j=freq[i];j>0;j--){
		            System.out.print(i+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
