class GFG
{class Stack{
        Node al[];
        int top;
        Stack(int n){
            al=new Node[n];
            top=-1;
        }
        void push(Node n){
            top++;
            al[top]=n;
            
        }
        Node pop(){
            if(top==-1){
                return null;
            }
            Node node=al[top];
            top--;
            return node;
        }
        Node peek(){
            if(top==-1){
                return null;
            }
            return al[top];
        }
    }
    Node constructTree(int n, int pre[], char preLN[])
    {
	    Node head=null,temp=null;
	    head=new Node(pre[0]);
	    if(preLN[0]!='N'){
	        return head;
	    }
	    Stack  s=new Stack(pre.length);
	    s.push(head);
	    s.push(head);
	    int i=1;
	    while(s.peek()!=null && i<pre.length){
	        temp=new Node(pre[i]);
	        Node tmp=s.pop();
	       if(tmp.left==null){
	               tmp.left=temp;
	            }
	       else{
	           tmp.right=temp;
	            }
	       if(preLN[i]=='N'){
	            s.push(temp);
	            s.push(temp);
	        }
	        i++;
	        
	    }
	    return head;
    }
}
