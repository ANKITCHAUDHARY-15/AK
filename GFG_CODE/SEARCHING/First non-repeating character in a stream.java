import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int nonRepeating(char str[],int fnr,int i){
         for(int j=fnr+1;j<=i;j++){
             boolean flag=true;
             for(int k=0;k<=i;k++){
                 if(j!=k && str[j]==str[k]){
                     flag=false;
                     break;
                 }
             }
             if(flag){
                 return j;
             }
         }
         return -1;
     }
	public static void main (String[] args) throws IOException
	 {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 //code
	 int t=Integer.parseInt(br.readLine());
	 while(t-->0){
	     int n=Integer.parseInt(br.readLine());
	     String st[]=br.readLine().trim().split(" ");
	     char str[]=new char[n];
	     for(int i=0;i<n;i++){
	         str[i]=st[i].charAt(0);
	     }
	     
	     int fnr=0;
	     StringBuffer sb=new StringBuffer();
	     //System.out.print(str[0]+" ");
	     sb.append(str[0]+" ");
	     for(int i=1;i<n;i++){
	         if(fnr==-1){
	             fnr=nonRepeating(str,i-1,i);
	             if(fnr==-1){
	                 //System.out.print(fnr+" ");
	                 sb.append(fnr+" ");
	             }
	             else{
	                 //System.out.print(str[fnr]+" ");
	                 sb.append(str[fnr]+" ");
	             }
	         }
	         else if(str[fnr]==str[i]){
	             fnr=nonRepeating(str,fnr,i);
	             if(fnr==-1){
	                 //System.out.print(fnr+" ");
	                 sb.append(fnr+" ");
	             }
	             else{
	                 //System.out.print(str[fnr]+" ");
	                 sb.append(str[fnr]+" ");
	             }
	         }
	         else{
	             //System.out.print(str[fnr]+" ");
	             sb.append(str[fnr]+" ");
	         }
	     }
	     System.out.println(sb);
	     
	 }
	 }
}
