class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n=arr.length;
        List<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int val=Math.abs(arr[i])-1;
            if(arr[val]<0)
            {
                al.add(val+1);
            }
            else
            {
                arr[val]=(-1)*arr[val];
            }
        }
        return al;
    }
}