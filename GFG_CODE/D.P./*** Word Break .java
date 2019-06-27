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
	        String str[]=br.readLine().trim().split(" ");
	        String s=br.readLine().trim();
	        
	     HashMap<String,Boolean> m=new HashMap<String,Boolean>();
	     int min=str[0].length(),max=0;
	     for(int i=0;i<str.length;i++){
	         m.put(str[i],true);
	         int x=str[i].length();
	         if(x>max){
	             max=x;
	         }
	         if(x<min){
	             min=x;
	         }
	     }
	     System.out.println(search(m,s,0,min,max));
	        
	   }
	 
	 }
	 static int search(HashMap<String,Boolean> m,String s,int i,int min,int max)
	 {
	     
	     if(i>=s.length()){
	         return 1;
	     }
         for(int j=min;j<=max;j++){
             if(i+j>s.length()){
                 break;
             }
	         String ss=s.substring(i,i+j);
	         if(m.get(ss)!=null){
	            int x=search(m,s,i+j,min,max);
	             if(x==1){
	                return 1;
	             }
	        }
	    }
	    return 0;
	 }
	     
}
