class Solution {
    public boolean containsCycle(char[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visited[i][j])
                {
                    
                    if(solve(i,j,i,j,visited,arr))
                        return true;
                }
            }
        }
        return false;
    }
    public static boolean solve(int prei,int prej,int i,int j,boolean visited[][],char arr[][])
    {
         
        int n=arr.length;
        int m=arr[0].length;
        //System.out.println("i is "+i+" j is "+j);
        if(i<0 || i>=n || j<0 || j>=m || arr[prei][prej]!=arr[i][j])
            return false;
        if(visited[i][j])
        {
           return true;
        }
        
        visited[i][j]=true;
        if(i-1!=prei)
        {
            if(solve(i,j,i-1,j,visited,arr))
                return true;
        }
        if(i+1!=prei)
        {
            if(solve(i,j,i+1,j,visited,arr))
                return true;
        }
        if(j-1!=prej)
        {
            if(solve(i,j,i,j-1,visited,arr))
                return true;
        }
        if(j+1!=prej)
        {
            if(solve(i,j,i,j+1,visited,arr))
                return true;
        }
        
        return false;
    }
}