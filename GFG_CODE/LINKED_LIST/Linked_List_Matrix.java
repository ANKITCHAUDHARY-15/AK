{
import java.io.*;
import java.util.Scanner;
class Node
{
    int data;
    Node right,down;
}
public class Linked_list_2D_Matrix {
 
    // node of linked list
 
    static void display(Node head) {
         
        Node Rp;
        Node Dp = head;
        while (Dp != null) {
            Rp = Dp;
            while (Rp != null) {
                System.out.print(Rp.data + " ");
                Rp = Rp.right;
            }
            Dp = Dp.down;
        }
        System.out.println();
    }
 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
            int p=sc.nextInt();arr[i][j]=p;}
        }
        GFG obj=new GFG();
        Node head = obj.construct(arr, n);
        display(head);
        }
    }
 
}
}
class GFG
{
    static Node construct(int arr[][],int n)
    {
        Node header=null,curr=null;
        header=new Node();
        header.data=arr[0][0];
        curr=header;
        for(int j=1;j<n;j++){
                curr.right=new Node();
                curr=curr.right;
                curr.data=arr[0][j];
                
        }
        Node h1=header,h2=null;
        for(int i=1;i<n;i++){
            if(i>1){
                h1=h2;
            }
             h2=new Node();
             h2.data=arr[i][0];
             curr=h2;
             h1.down=h2;
             h1=h1.right;
            for(int j=1;j<n;j++){
                curr.right=new Node();
                curr=curr.right;
                curr.data=arr[i][j];
                h1.down=curr;
                h1=h1.right;
            }
        }
        return header;
    }
}
