class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=0;
            if(sum<0)
            {
                rem=((-1)*sum)%k;
                if(rem!=0)
                {
                rem=-1*rem;
                rem+=k;
                }
            }
            else
            {
                rem=sum%k;
            }
            if(map.containsKey(rem))
            {
                count+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else
                map.put(rem,1);
            
        }
        return count;
    }
}