class Solution {
    public void setZeroes(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        boolean col=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                
                if(arr[i][j]==0)
                {
                    if(j==0)
                        col=false;
                    else
                    {
                    arr[i][0]=0;
                    arr[0][j]=0;
                    }
                }
            }
        }
        
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=1;j--)
            {
                if(arr[i][0]==0 || arr[0][j]==0)
                    arr[i][j]=0;
                
            }
            if(col==false)
                arr[i][0]=0;
        }
    }
}