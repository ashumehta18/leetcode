https://leetcode.com/problems/linked-list-cycle/submissions/1712292729/?envType=problem-list-v2&envId=linked-list

// Using a HashSet
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        Set<ListNode> visited = new HashSet<>();
        ListNode current = head;

        while (current != null) {
            if (visited.contains(current)) {
                return true;
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }
}
