class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        int max=0;
        for(int i=0;i<n;i++)
        {
            int odd=solve(i-1,i+1,s)+1;
            int even=solve(i,i+1,s);
            if(odd>even)
            {
                if(max<odd)
                {
                    int start=i-((odd-1)/2);
                    int end=i+((odd-1)/2);
                    String str="";
                    while(start<=end)
                        str+=s.charAt(start++);
                    ans=str;
                    max=odd;
                }
            }
            else
            {
                if(max<even)
                {
                    String str="";
                    int start=i+1-(even/2);
                    int end=i+(even/2);
                    while(start<=end)
                        str+=s.charAt(start++);
                    ans=str;
                    max=even;
                }
            }
            
        }
        return ans;
    }
    public static int solve(int i,int j,String s)
    {
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
            count+=2;
        }
        return count;
        
    }
}