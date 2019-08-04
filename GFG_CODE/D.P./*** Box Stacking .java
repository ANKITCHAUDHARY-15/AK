//https://practice.geeksforgeeks.org/problems/box-stacking/1

class Geeks 
{
    static class box{
        int l,w,h;
        box(int l,int w,int h){
            this.l=l;
            this.w=w;
            this.h=h;
        }
    }
    public static int maxHeight(int height[], int width[], int length[], int n)
   {
       // your code here
       //int n=height.length;
       box b[]=new box[3*n];
       
       for(int i=0,j=0;i<n;i++){
           int l=length[i],w=width[i],h=height[i];
           if(l<w){
               b[j++]=new box(w,l,h);
           }
           else{
               b[j++]=new box(l,w,h);
           }
           
           if(l<h){
              b[j++]=new box(h,l,w); 
           }
           else
              b[j++]=new box(l,h,w);
           
           if(w<h){
               b[j++]=new box(h,w,l);
           }
           else
             b[j++]=new box(w,h,l);
       }
       Arrays.sort(b,new Comparator<box>(){
           public int compare(box x,box y){
               return y.l*y.w-x.l*x.w;
           }
       });
       int max[]=new int[3*n];
       for(int i=0;i<3*n;i++){
           max[i]=b[i].h;
       }
       int mh=0;
       for(int i=1;i<3*n;i++){
           int m=max[i];
           for(int j=0;j<i;j++){
               if(b[j].l>b[i].l && b[j].w>b[i].w && max[i]+max[j]>m){
                   m=max[i]+max[j];
               }
           }
           max[i]=m;
           if(m>mh){
               mh=m;
           }
       }
     return mh; 
   }
}
