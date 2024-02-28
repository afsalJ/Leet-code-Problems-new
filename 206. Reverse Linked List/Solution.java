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
    public ListNode reverseList(ListNode head) {
        ListNode before =null;
        ListNode now = head;
        ListNode after;
        while(now != null){
            after = now.next;
            now.next=before;
            before = now;
            now = after;
        }
        return before;
    }
}