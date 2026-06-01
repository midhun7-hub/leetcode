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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        if(n==c){
            return head.next;
        }
        int k=1;
        ListNode t = head;
        while(k<c-n){
            k++;
            t=t.next;
        }
        t.next=t.next.next;
        return head;
    }
}