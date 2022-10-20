class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n=arr.length;
        List<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int val=Math.abs(arr[i])-1;
            if(arr[val]>0)
                arr[val]=(-1)*arr[val];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
                al.add(i+1);
        }
        return al;
    }
}