class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        int j=0;
        for(int i=0;i<fruits.length;i++)
        {
            int ch=fruits[i];
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
                map.put(ch,1);
            if(map.size()<=2)
            {
                max=Math.max(max,i-j+1);
            }
            while(map.size()>2 && j<i)
            {
                int ch1=fruits[j];
                j++;
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0)
                    map.remove(ch1);
            }
        }
        return max;
    }
}