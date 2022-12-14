//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] floodFill(int[][] arr, int sr, int sc, int newval)
    {
        int val= arr[sr][sc];
        int n=arr.length;
        int m=arr[0].length;
        boolean visited[][]=new boolean[n][m];
        solve(visited,val,newval,arr,sr,sc);
        return arr;
    }
    public static void solve(boolean visited[][],int val,int newval,int arr[][],int i,int j)
    {
        int n=arr.length;
        int m=arr[0].length;
        if(i<0 || i>=n || j<0 || j>=m || arr[i][j]!=val || visited[i][j])
            return;
        arr[i][j]=newval;
        visited[i][j]=true;
        solve(visited,val,newval,arr,i-1,j);
        solve(visited,val,newval,arr,i+1,j);
        solve(visited,val,newval,arr,i,j-1);
        solve(visited,val,newval,arr,i,j+1);
    }
}