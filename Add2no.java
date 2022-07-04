/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/
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
class Add2no {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, sum;
        ListNode head = new ListNode(0);
        ListNode ln1 = l1, ln2 = l2, node = head;
        
        while (carry != 0 || ln1 != null || ln2 != null) {
            sum = carry; // reset sum to value of carry
            
            if (ln1 != null) {
                sum += ln1.val;
                ln1 = ln1.next;
            }
            if (ln2 != null) {
                sum += ln2.val;
                ln2 = ln2.next;
            }
            
            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next; 
        }
        return head.next; 
    }
}
