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
    public ListNode mergeNodes(ListNode head) {
        if(head.next==null)
        {
            return head;
        }
        ListNode curr=head.next;
        ListNode at=head;
        int sum=0;
        while(curr.next!=null)
        {
            while(curr.val!=0)
            {
                sum+=curr.val;
                curr=curr.next;

            }
            
            at.val=sum;
            sum=0;
            if(curr.next==null)
            {
                break;
            }
            at=at.next;
            curr=curr.next;
            

        }
        at.next=null;
        return head;
        
    }
}