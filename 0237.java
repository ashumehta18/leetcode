https://leetcode.com/submissions/detail/1829321984/


class Solution {
    public void deleteNode(ListNode node) {
       node.val = node.next.val;        
        node.next = node.next.next; 
    }
}
