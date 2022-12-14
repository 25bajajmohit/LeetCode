/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return null;
        Queue<Node>q=new LinkedList<>();
        root.next=null;
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            if(temp.left!=null)
                temp.left.next=temp.right;
            if(temp.next!=null && temp.right!=null)
            {
                temp.right.next=temp.next.left;
            }
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        return root;
    }
}