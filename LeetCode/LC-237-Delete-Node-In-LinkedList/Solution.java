/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // assign current node val to next val
        node.val = node.next.val;
        // remove the next node
        node.next = node.next.next;
    }
}
