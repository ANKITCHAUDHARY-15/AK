class Tree
{
    // Should print bottom view of tree with given root
    void setHd(Node root,int hd){
        if(root==null){
            return;
        }
        setHd(root.left,hd-1);
        root.hd=hd;
        setHd(root.right,hd+1);
        
    }
    public void bottomView(Node root)
    {
        // Your code here
        if(root==null){
            return;
        }
        //setHd(root,0);
        int l=0,r=0;
        HashMap<Integer,Node> map=new HashMap<>();
        Queue<Integer> que=new LinkedList<>();
        map.put(0,root);
        que.offer(0);
        while(!que.isEmpty()){
            int t=que.poll();
            Node temp=map.get(t);
            if(temp.left!=null){
                que.offer(t-1);
                map.put(t-1,temp.left);
                if(l>t-1){
                    l=t-1;
                }
            }
            if(temp.right!=null){
                que.offer(t+1);
                map.put(t+1,temp.right);
                if(t+1>r){
                    r=t+1;
                }
            }
            //System.out.println(t+" "+temp.data+" "+temp.left+" "+temp.right);
            
        }
        StringBuffer sb=new StringBuffer();
        while(l<=r){
            Node tmp=map.get(l);
            sb.append(tmp.data+" ");
            l++;
        }
        System.out.print(sb);
        
        
    }
}
	
