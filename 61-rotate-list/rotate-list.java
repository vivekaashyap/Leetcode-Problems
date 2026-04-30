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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int len = length(head);
        k = k % len;
        if(k == 0) return head;

        int steps = len - k - 1;
        ListNode temp = head;
        while(steps > 0){
            temp = temp.next;
            steps--;
        }
        ListNode newHead = temp.next;
        temp.next = null;

        temp = newHead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }
    public int length(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count; 
    }
}