class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int start=1;
        int ans=-1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int val=arr[i]-start;
            if(val==0)
            {
                start=arr[i]+1;
                continue;
            }
            count=count+val;
            start=arr[i]+1;
            if(count>=k)
            {
                ans=arr[i]-1-(count-k);
                break;
            }
        }
        if(ans==-1)
            return start-1+(k-count);
        return ans;
    }
}