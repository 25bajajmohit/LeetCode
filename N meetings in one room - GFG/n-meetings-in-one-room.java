//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
       ArrayList<pair>al=new ArrayList<pair>();
       for(int i=0;i<n;i++)
       {
           al.add(new pair(start[i],end[i]));
       }
       Collections.sort(al,new Comparator<pair>()
       {
           @Override
           public int compare(pair one,pair two)
           {
               return one.b-two.b;
           }
       });
       int ans=1;
       
       int last=al.get(0).b;
       for(int i=1;i<n;i++)
       {
           if(al.get(i).a>last)
           {
               ans++;
               last=al.get(i).b;
           }
       }
       return ans;
    }
    
   public static class pair{
        int a;
        int b;
        pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
}
