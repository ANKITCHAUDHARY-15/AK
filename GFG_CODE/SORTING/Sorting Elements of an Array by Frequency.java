class sorting{
static void sortByFreq(int arr[], int n)
    {
        int freq[]=new int[61];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        int max=max(freq);
        while(max!=0){
            for(int i=freq[max];i>0;i--){
                System.out.print(max+" ");
            }
            freq[max]=0;
            max=max(freq);
        }
        
    }
    static int max(int fr[]){
        int max=0;
        for(int i=0;i<fr.length;i++){
            if(fr[i]>fr[max]){
                max=i;
            }
        }
   }
