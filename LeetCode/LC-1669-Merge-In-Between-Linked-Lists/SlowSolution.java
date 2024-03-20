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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode endList2 = list2;

        while(endList2.next != null){
            endList2 = endList2.next;
        }
        int cnt = 1;
        ListNode temp = list1;
        ListNode athNode = null , bthNode = null;
        while(cnt <= b+1){

            if(cnt == a){
                athNode = temp;
            }
            if(cnt == b+1)
                bthNode = temp.next;
            cnt++;
            temp = temp.next;
        }
        athNode.next = list2;
        endList2.next = bthNode;


        return list1;
    }
}
