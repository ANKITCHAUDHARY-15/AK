class GfG
{
     public void diagonalPrint(TreeNode root)
      {
           //add your code here.
           Queue<TreeNode> q=new LinkedList<TreeNode>();
           if(root==null){
               return;
           }
           q.add(root);
           TreeNode temp=null;
           while(!q.isEmpty()){
               if(temp==null){
                   temp=q.poll();
               }
               if(temp.left!=null){
                    q.add(temp.left);
                }
              System.out.print(temp.data+" ");
              temp=temp.right;
           }
      }
}
