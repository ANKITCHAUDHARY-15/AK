class Spiral
{
      void printSpiral(Node node) 
      {
           // Your code here
           if(node==null){
               return;
           }
           Queue<Node> que=new LinkedList<>();
           Stack<Node> s=new Stack<>();
           StringBuffer sb=new StringBuffer();
           sb.append(node.data+" ");
           if(node.left!=null){
               que.offer(node.left);
           }
           if(node.right!=null){
               que.offer(node.right);
           }
           que.offer(null);
           boolean flag=true;
           while(que.size()>1){
              Node temp=que.poll();
              if(flag){
              while(temp!=null){
               sb.append(temp.data+" ");
               if(temp.left!=null){
                    s.push(temp.left);
                }
                if(temp.right!=null){
                    s.push(temp.right);
                }
                temp=que.poll();
              }
              while(!s.empty()){
                  que.offer(s.pop());
              }
              que.offer(null);
           }
           else{
               while(temp!=null){
               sb.append(temp.data+" ");
               if(temp.right!=null){
                    s.push(temp.right);
                }
               if(temp.left!=null){
                    s.push(temp.left);
                }
                
                temp=que.poll();
              }
              while(!s.empty()){
                  que.offer(s.pop());
              }
              que.offer(null);
           }
           flag=!flag;
           }
           System.out.print(sb);
      }
}
