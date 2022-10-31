/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>al=new ArrayList<>();
        solve(root,0,targetSum,al,ans);
        return ans;
    }
    public static void solve(TreeNode root,int sum,int target,List<Integer>al,List<List<Integer>>ans)
    {
        if(root==null)
            return;
        sum+=root.val;
        al.add(root.val);
        if(root.left==null && root.right==null)
        {
            if(sum==target)
            {
                ans.add(new ArrayList<>(al));
            }
            al.remove(al.size()-1);
            return;
        }
        solve(root.left,sum,target,al,ans);
        solve(root.right,sum,target,al,ans);
        al.remove(al.size()-1);
        
    }
}