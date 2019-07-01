class Tree {
    
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        
        if(T==null){
            if(S==null){
                return true;
            }
            return false;
        }
        if(T.data==S.data){
            Stack<Node> s=new Stack();
            Stack<Node> ss=new Stack();
            s.push(T);
            ss.push(S);
            Node temp1=T,temp2=S;
            boolean f=true;
            notFound:
            while(!s.empty()){
                temp1=s.pop();
                temp2=ss.pop();
                while(temp1!=null && temp2!=null){
                    if(temp1.data!=temp2.data){
                        f=false;
                        break notFound;
                    }
                    if(temp1.right!=null && temp2.right!=null){
                        s.push(temp1.right);
                        ss.push(temp2.right);
                    }
                    else if(temp1.right!=null || temp2.right!=null){
                        f=false;
                        break notFound;
                    }
                    
                    temp1=temp1.left;
                    temp2=temp2.left;
                }
            }
            if(f && s.empty() && ss.empty()){
                return true;
            }
        }
        return isSubtree(T.left,S) || isSubtree(T.right,S);
        
    }
}
