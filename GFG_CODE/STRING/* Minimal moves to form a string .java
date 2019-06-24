import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static boolean substr(String str,int i){
         for(int j=0,k=i/2+1;j<=i/2;j++,k++){
             if(str.charAt(j)!=str.charAt(k)){
                 return false;
             }
         }
         return true;
     }
	public static void main (String[] args) throws IOException
	 {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 //code
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	         
	        String str=br.readLine().trim();
	        int i=str.length()-1,step=0;
	        while(i>=0){
	            if(i%2==0){
	                step++;
	                i--;
	            }
	            else{
	                if(substr(str,i)){
	                    step++;
	                    i=i/2;
	                }
	                else{
	                    step++;
	                    i--;
	                }
	            }
	        }
	        System.out.println(step);
	         
	        
	   }
	 
	 }
}
