//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public static int n;
    public static int m;
    public int numIslands(char[][] arr) {
        n=arr.length;
        m=arr[0].length;
        int count=0;
        
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visited[i][j] && arr[i][j]=='1')
                {
                    solve(i,j,visited,arr);
                    count++;
                }
            }
        }
        return count;
    }
    public static void solve(int i,int j,boolean visited[][],char arr[][])
    {
        //System.out.println("i is "+i+" j is "+j);
        visited[i][j]=true;
        if(j-1>=0 && arr[i][j-1]=='1' && !visited[i][j-1])
        {
            visited[i][j-1]=true;
            solve(i,j-1,visited,arr);
        }
        //upright
        if(i-1>=0 && j+1<m && arr[i-1][j+1]=='1' && !visited[i-1][j+1])
        {
            solve(i-1,j+1,visited,arr);
        }
        //right
        if(j+1<m && arr[i][j+1]=='1' && !visited[i][j+1])
        {
            solve(i,j+1,visited,arr);
        }
        //downright
        if(i+1<n && j+1<m && arr[i+1][j+1]=='1' && !visited[i+1][j+1])
        {
            solve(i+1,j+1,visited,arr);
        }
        //down
        if(i+1<n && arr[i+1][j]=='1' && !visited[i+1][j])
        {
            solve(i+1,j,visited,arr);
        }
        //leftdown
        if(i+1<n && j-1>=0 && arr[i+1][j-1]=='1' && !visited[i+1][j-1])
        {
            solve(i+1,j-1,visited,arr);
        }
        //leftup
        if(i-1>=0 && j-1>=0 && arr[i-1][j-1]=='1' && !visited[i-1][j-1])
        {
            solve(i-1,j-1,visited,arr);
        }
        //up
        if(i-1>=0 && arr[i-1][j]=='1' && !visited[i-1][j])
        {
            solve(i-1,j,visited,arr);
        }
    }
}