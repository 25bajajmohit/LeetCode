/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode mainstart=new ListNode(0);
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        ListNode curhead=mainstart;
        ListNode start=head;
        ListNode prev=null;
        ListNode cur=head;
        while(n>=k)
        {
            int count=0;
            while(count<k)
            {
                temp=cur.next;
                cur.next=prev;
                prev=cur;
                cur=temp;
                count++;
            }
            curhead.next=prev;
            start.next=cur;
            prev=null;
            curhead=start;
            start=cur;
            n=n-k;
        }
        return mainstart.next;
    }
}