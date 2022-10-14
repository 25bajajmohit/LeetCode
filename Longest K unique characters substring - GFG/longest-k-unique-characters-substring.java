//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int max=-1;
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
            if(map.size()==k)
            {
                max=Math.max(max,i-j+1);
            }
            while(map.size()>k && j<i)
            {
                char ch1=s.charAt(j);
                j++;
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0)
                    map.remove(ch1);
            }
        }
        return max;
        
    }
}