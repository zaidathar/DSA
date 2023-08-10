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
    public ListNode reverseList(ListNode head){
        ListNode newL = head ;
        ListNode reversed = null;
        while(newL!=null){
            ListNode temp = new ListNode(newL.val);
            temp.next = reversed;
            reversed = temp;
            newL = newL.next;
        }
        
        return reversed;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode reversed = reverseList(head);
        
        while(head!=null){
            System.out.println(head.val+" <-> "+reversed.val);
            if(head.val != reversed.val)return false;
            head = head.next;
            reversed = reversed.next;
        }
        
        return true;
    }
}