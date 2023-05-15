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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> arr = new ArrayList<>();

        ListNode node = head;
        while(node != null){
            arr.add(node.val);
            node = node.next;
        }
        int len = arr.size();

        int temp = arr.get(k-1);
        arr.set(k-1 , arr.get(len - k));
        arr.set(len - k , temp);

        node = head;
        int i = 0;
        while(node != null){
            if(node.val != arr.get(i)){
                node.val = arr.get(i);
            }
            i++;
            node = node.next;
        }

        return head;
    }
}
