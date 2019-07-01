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
	        int n=Integer.parseInt(br.readLine());
	        StringBuffer sb=new  StringBuffer();
	        while(n>0){
	            int x=n%26;
	            if(x==0){
	                sb.append('Z');
	                n=n/26-1;
	            }
	            else{
	                char c=(char)(x-1+'A');
	                sb.append(c);
	                n/=26;
	            }
	            
	        }
	        System.out.println(sb.reverse());
	        
	   }
	 
	 }
}
