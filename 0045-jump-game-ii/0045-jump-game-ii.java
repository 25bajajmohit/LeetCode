class Solution {
    
    
    public int jump(int[] arr) {
        int n=arr.length;
        int curmax=0;
        int curreach=0;
        int jump=0;
        for(int i=0;i<n-1;i++)
        {
            if((arr[i]+i)>curmax)
                curmax=i+arr[i];
            if(i==curreach)
            {
                jump++;
                curreach=curmax;
            }
        }
        return jump;
    }
}