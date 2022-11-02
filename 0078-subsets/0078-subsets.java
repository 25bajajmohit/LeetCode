class Solution {
    public List<List<Integer>> subsets(int[] al) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        solve(0,al,ans,temp);
        return ans;
    }
public static void solve(int i,int al[],List<List<Integer>>ans,List<Integer> temp)
    {
        if(i>=al.length)
            {
                ans.add(new ArrayList<>(temp));
                return;
            }
        solve(i+1,al,ans,temp);
        temp.add(al[i]);
        solve(i+1,al,ans,temp);
        temp.remove(temp.size()-1);
    }
}