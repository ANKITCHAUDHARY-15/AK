class GfG
{
	public static void merge(Node root1 , Node root2)
    {
        Stack <Node> s1=new Stack<Node>();
        Stack <Node> s2=new Stack<Node>();
        Node temp=root1;
        while(temp!=null){
            s1.push(temp);
            temp=temp.left;
        }
        temp=root2;
        while(temp!=null){
            s2.push(temp);
            temp=temp.left;
        }
        while(!(s1.empty() && s2.empty())){
            Node t;
            temp=t=null;
            if(!s1.empty())
               t=s1.peek();
            if(!s2.empty())
                temp=s2.peek();
            if(t==null){
                System.out.print(temp.data+" ");
                s2.pop();
                //temp=temp.right;
            }
            else if(temp==null){
                System.out.print(t.data+" ");
                s1.pop();
                //t=t.right;
            }
            else if(t.data<temp.data){
                System.out.print(t.data+" ");
                s1.pop();
                //t=t.right;
                temp=null;
            }
            else{
                System.out.print(temp.data+" ");
                s2.pop();
                //temp=temp.right;
                t=null;
            }
            if(t!=null && t.right!=null){
                t=t.right;
            while(t!=null){
               s1.push(t);
               t=t.left;
             }
            }
            if(temp!=null && temp.right!=null){
                temp=temp.right;
            while(temp!=null){
              s2.push(temp);
              temp=temp.left;
             }
            }
        }
        
    }
}
