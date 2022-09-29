class Solution {
    public int strStr(String a, String b) {
        for(int i=0;i<a.length();i++)
        {
            if(a.length()-i<b.length())
                return -1;
            int k=i;
            int j=0;
            while(k<a.length() && j<b.length() && a.charAt(k)==b.charAt(j))
            {
                k++;
                j++;
            }
            if(j>=b.length())
                return i;
        }
        return -1;
    }
}