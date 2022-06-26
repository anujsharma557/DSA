package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #234 - Palindrome Linked List
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode p1=head;
        ListNode secondHead = secondHead(head);
        ListNode revSecondHead = reverse(secondHead.next);
        ListNode p2=revSecondHead;
        while(p2!=null){
            if(p2.val!=p1.val){
                return false;
            }
            p2=p2.next;
            p1=p1.next;
        }
        return true;

    }
    private ListNode secondHead(ListNode head){
        ListNode slow= head;
        ListNode fast= head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
