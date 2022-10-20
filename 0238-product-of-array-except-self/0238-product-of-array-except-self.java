class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int res[]=new int[n];
        int pro=arr[0];
        res[0]=1;
        for(int i=1;i<n;i++)
        {
            res[i]=pro;
            pro=pro*arr[i];
        }
        
        pro=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            res[i]=res[i]*pro;
            pro=pro*arr[i];
        }
        return res;
    }
}