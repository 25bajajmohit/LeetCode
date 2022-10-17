//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int N) { 
         HashSet<Integer>set=new HashSet<>();
         while(N!=1 && !set.contains(N))
         {
             set.add(N);
             int num=N;
             int sum=0;
             while(num!=0)
             {
                 sum+=(num%10)*(num%10);
                 num=num/10;
             }
             N=sum;
             //System.out.println(sum);
         }
         if(N==1)
            return 1;
        return 0;
     }
}