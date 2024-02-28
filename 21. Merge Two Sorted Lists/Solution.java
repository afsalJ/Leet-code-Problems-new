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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode iter = head;
        while(list1 != null && list2!=null){
            ListNode temp;
            if(list1.val < list2.val){
                temp = new ListNode(list1.val);
                iter.next = temp;
                list1 = list1.next;
            }
            else{
                temp = new ListNode(list2.val);
                iter.next = temp;
                list2 = list2.next;
            }
            iter = iter.next;
        }

        if(list1 != null){
            iter.next = list1;
        }
        else{
            iter.next = list2;
        }

        return head.next;
    }
}