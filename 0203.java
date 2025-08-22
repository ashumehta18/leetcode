https://leetcode.com/problems/linked-list-cycle/submissions/1712292729/?envType=problem-list-v2&envId=linked-list

class Solution {
    public ListNode removeElements(ListNode head, int val) {
    
       
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
             
        }
         if(head != null && head.val == val){
            head = head.next;
       }
        return head;
    }
}
