https://leetcode.com/problems/swap-nodes-in-pairs/submissions/1866458293/

class Solution {
    public ListNode swapPairs(ListNode head) {
        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        // Traverse while at least two nodes remain
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev to the next pair
            prev = first;
        }

        return dummy.next;
    }
}
