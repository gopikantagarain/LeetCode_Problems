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
    public static ListNode reversedLL(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp != null){
            ListNode curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) 
            return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reversedLL(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second != null){
            if(first.val !=second.val){
                reversedLL(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reversedLL(newHead);
        return true;
        
    }
}