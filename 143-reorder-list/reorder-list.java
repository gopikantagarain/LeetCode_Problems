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
    public void reorderList(ListNode head) {
        ListNode front = head;
        ListNode prev;
        ListNode last;
        while(front.next != null && front.next.next != null)
        {
            prev = findLast(head);
            last = prev.next;
            ListNode temp = front.next;
            front.next = last;
            last.next = temp;
            prev.next = null;
            front = front.next;
            if(front == null)
                break;
            if(front.next != null)
                front = front.next;
        }
    }
    public ListNode findLast(ListNode head)
    {
        ListNode curr = head;
        while(curr.next.next!=null)
        {
            curr = curr.next;
        }
        return curr;
    }
}