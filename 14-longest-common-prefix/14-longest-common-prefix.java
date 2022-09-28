class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==1)
            return strs[0];
        String ans="";
        int index=0;
        int flag=0;
        while(flag==0){
        for(int i=1;i<n;i++)
        {
            if(index>=strs[0].length() || index>=strs[i].length())
                flag=1;
            else if(strs[0].charAt(index)==strs[i].charAt(index))
            {
                
                
            }
            else
                flag=1;
        }
            if(flag==0)
            ans+=strs[0].charAt(index);
            index++;
        }
        return ans;
    }
}