class GfG
{
    static void print(int arr[][],int i,int c){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.print('$');
    }
            public static void printMat(int arr[][],int r, int c)
             {
                //add code here.
                Set<Integer> map=new HashSet<>();
                for(int i=0;i<r;i++){
                    //String str="";
                    StringBuffer sb=new StringBuffer();
                    for(int j=0;j<c;j++){
                        //str=str+arr[i][j];
                        sb.append(arr[i][j]);
                    }
                    int x=Integer.valueOf(sb.toString(),2);
                    if(!map.contains(x)){
                        print(arr,i,c);
                        map.add(x);
                    }
                    
                }
             }
}
