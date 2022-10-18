class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>()
                    {
                        @Override
                        public int compare(int a[],int b[])
                        {
                            return a[1]-b[1];
                        }
                    });
        int n=arr.length;
        int count=1;
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=0;i<n;i++)
        {
            if(arr[i][0]>=end)
            {
                count++;
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        return n-count;
        
    }
}