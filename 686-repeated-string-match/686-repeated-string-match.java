class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n=a.length();
        int m=b.length();
        int count=1;
        int i=0;
        int j=0;
        while(i<n)
        {
            if(a.charAt(i)==b.charAt(j))
            {
                int starta=i;
                int startb=j;
                while(startb!=m)
                {
                    if(starta>=n)
                    {
                        count++;
                        starta=0;
                    }
                    if(a.charAt(starta)==b.charAt(startb))
                    {
                        starta++;
                        startb++;
                    }
                    else
                        break;
                    
                }
                if(startb==m)
                    return count;
                else
                    count=1;
            }
            i++;
        }
        return -1;
    }
}