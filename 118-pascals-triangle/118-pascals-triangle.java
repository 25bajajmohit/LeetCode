class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>al=new ArrayList<>();
        List<Integer>pre=new ArrayList<>();
        pre=null;
        int count=0;
        while(count<numRows)
        {
            List<Integer>temp=new ArrayList<>();
            int ans=1;
            for(int r=0;r<=count;r++)
            {
                if(r==0 || r==count)
                    ans=1;
                else
                {
                    ans=pre.get(r-1)+pre.get(r);
                }
                
                temp.add(ans);
             }
            
            al.add(temp);
            pre=temp;
            count++;
            
        }
        return al;
    }
}