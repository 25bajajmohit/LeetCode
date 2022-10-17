class Solution {
    public int[] sortedSquares(int[] arr) {
        int ans[]=new int[arr.length];
        int index=0;
        while(index<arr.length && arr[index]<0)
            index++;
        int i=index-1;
        int j=index;
        index=0;
        while(i>=0 && j<arr.length)
        {
            if(Math.abs(arr[i])<Math.abs(arr[j]))
            {
                ans[index++]=arr[i]*arr[i];
                i--;
            }
            else
            {
                ans[index++]=arr[j]*arr[j];
                j++;
            }
        }
        while(i>=0)
        {
            ans[index++]=arr[i]*arr[i];
            i--;
        }
        while(j<arr.length)
        {
            ans[index++]=arr[j]*arr[j];
            j++;
        }
        return ans;
        
    }
}