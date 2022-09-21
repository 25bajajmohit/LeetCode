class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int index=-1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
                index=i;
        }
        int newIndex=-1;
        if(index!=-1)
        {
        for(int k=0;k<n;k++)
        {
            if(arr[k]>arr[index])
                newIndex=k;
        }
            int temp=arr[index];
        arr[index]=arr[newIndex];
                                            arr[newIndex]=temp;
                                            
                                            
        }
                                            int low=index+1;
                                            int high=n-1;
                                            while(low<high)
                                            {
                                                int temp=arr[low];
                                                arr[low]=arr[high];
                                                arr[high]=temp;
                                                low++;
                                                high--;
}
            
        
    }
}