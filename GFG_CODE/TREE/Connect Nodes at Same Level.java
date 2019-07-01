class GfG
{
    // Function to connect nodes at same level
    void connect(Node root)
    {
        // Your code here
        Queue<Node> que=new LinkedList<Node>();
        que.add(null);
        que.add(root);
        
        while(que.size()>1){
            Node temp=que.poll();
            while(temp!=null){
               if(temp.left!=null){
                     que.add(temp.left);
                }
                if(temp.right!=null){
                    que.add(temp.right);
                }
                temp.nextRight=que.poll();
                temp=temp.nextRight;
            }
            que.add(null);
            
        }
    }
}
