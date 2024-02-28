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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val ==val){
            head= head.next;
        }

        if(head == null){
            return null;
        }

        ListNode before = head;
        ListNode now = before.next;
        ListNode after;
        while(now != null){
            after = now.next;
            if(now.val == val){
                before.next = after;
            }
            else{
                before = before.next ;
            }
            now = before.next;
        }

        return head;
    }
}