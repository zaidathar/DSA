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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        int val = head.val;
        ListNode list = head , res = head;
        list = list.next;
        while(list!=null){
            if(list.val == val){
                list = list.next;
            }
            else{
                val = list.val;
                res.next = list;
                list = list.next;
                res = res.next;
            }
        }
        res.next = list;
        return head;
    }
}