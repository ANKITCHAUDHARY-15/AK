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
	        int n=Integer.parseInt(br.readLine().trim());
	        String str[]=br.readLine().trim().split(" ");
	        int arr[]=new int[str.length];
	        for(int i=0;i<str.length;i++){
	            arr[i]=Integer.parseInt(str[i]);
	        }
	        long brr[]=new long[str.length];
	        brr[0]=arr[0];
	        for(int i=1;i<str.length;i++){
	            brr[i]=brr[i-1]+arr[i];
	        }
	        //System.out.println(Arrays.toString(brr));
	        int i=1;
	        boolean flag=true;
	        while(i<str.length && brr[i-1]<=brr[str.length-1]-brr[i]){
	            if(brr[i-1]==brr[str.length-1]-brr[i]){
	                flag=false;
	                System.out.println("YES");
	                break;
	            }
	            i++;
	        }
	        if(flag){
	            if(str.length==1){
	                System.out.println("YES");
	            }
	            else
	              System.out.println("NO");
	        }
	        
	   }
	 
	 }
}
