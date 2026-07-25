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
        ListNode count = head;
        int size =0 ;
        while(count!=null)
        {
            size++;
            count = count.next;
            
        }
        if (size == n) 
        {
            return head.next;
        }

        ListNode temp = head;

        
        size = size - n;

        while(size > 1 )
        {
            temp = temp.next;
            size--;
        }

        temp.next = temp.next.next;
        return head;
    }
}