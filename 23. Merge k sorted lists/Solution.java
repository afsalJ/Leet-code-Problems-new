class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists);
    }
    
    public ListNode merge(ListNode[] lists) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null && lists[i].val < minValue) {
                minValue = lists[i].val;
                minIndex = i;
            }
        }
        if (minIndex == -1) {
            return null;
        }
        ListNode root = lists[minIndex];
        lists[minIndex] = lists[minIndex].next;
        root.next = merge(lists);
        
        return root;
    }
}