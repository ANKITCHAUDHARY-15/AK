/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int N=10000001;
		boolean prime[]=new boolean[N];
		Arrays.fill(prime,true);
		prime[0]=prime[1]=false;
		for(int i=2;i*i<N;i++){
		    if(prime[i]==true){
		        for(int j=i+i;j<N;j+=i){
		            prime[j]=false;
		        }
		    }
		}
		
		
		int superPrime[]=new int[10000001];
		
		for(int i=2;i<N;i++){
		    int k=i-2;
		    if(prime[i] && k>2 && prime[k]){
		        superPrime[i]=superPrime[i-1]+1;
		    }
		    else{
		        superPrime[i]=superPrime[i-1];
		    }
		}
 
		while(t-->0){
		    int n=sc.nextInt();
		    
		    
		    System.out.println(superPrime[n]);
		    
		}
	}
}
