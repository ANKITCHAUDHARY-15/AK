class Tree
{
    public void printTopView(Node root)
    {
        //add code here.
        if(root==null)
            return;
        HashMap<Node,Integer> map=new HashMap<>();
        Queue<Node> que=new LinkedList<>();
        int l=0,r=0;
        System.out.print(root.data+" ");
        
        que.add(root);
        map.put(root,0);
        while(!que.isEmpty()){
            Node temp=que.poll();
            int x=map.get(temp);
            if(temp.left!=null){
                que.add(temp.left);
                map.put(temp.left,x-1);
            }
            if(temp.right!=null){
                que.add(temp.right);
                map.put(temp.right,x+1);
            }
            if(x<l){
                System.out.print(temp.data+" ");
                l--;
            }
            else if(x>r){
                System.out.print(temp.data+" ");
                r++;
            }
            
            
        }
    }
}
