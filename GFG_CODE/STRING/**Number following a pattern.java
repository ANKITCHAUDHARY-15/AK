import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 //code
	 int t=Integer.parseInt(br.readLine());
	 while(t-->0){
	     String str=br.readLine();
	     int i=0;
	     if(str.charAt(i)=='I'){
	         System.out.print(i+1);
	     }
	      while(i<str.length()){
	         if(str.charAt(i)=='I'){
	             if(i+1<str.length() && str.charAt(i+1)=='I'){
	                 i++;
	                System.out.print(i+1);
	             
	             }
	             else{
	                 int k=1;
	                 while(i+k<str.length() && str.charAt(i+k)=='D'){
	                     k++;
	                 }
	                 int j=k;
	                 while(k+i>i){
	                     System.out.print(i+k+1);
	                     k--;
	                 }
	                 i+=j;
	             }
	             
	         }
	         else{
	             int k=1;
	             while(i+k<str.length() && str.charAt(i+k)=='D'){
	                 k++;
	             }
	             int j=k;
	             while(k+i>=i){
	                    System.out.print(i+k+1);
	                    k--;
	           }
	           i+=j;
	         }
	     }
	     System.out.println();
	 }
	 }
}
