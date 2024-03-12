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
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head == null)return head;
        ListNode res = new ListNode();
        res.next = head;

        Map<Integer, ListNode> prefixSumMap = new HashMap<>();

        int prefixSum =0 ;
        ListNode node = res;
        while(node != null){
            prefixSum += node.val;

            if(prefixSumMap.containsKey(prefixSum)){

                ListNode targetNode = prefixSumMap.get(prefixSum);
                ListNode nodeToDelete = targetNode.next ; // deleting node after prefixsum node
                // where to stop ? 
                // current node is destination
                int sumOfNodeVal = prefixSum + (nodeToDelete != null ?  nodeToDelete.val : 0);
                while(sumOfNodeVal != prefixSum ){
                    prefixSumMap.remove(sumOfNodeVal);
                    nodeToDelete = nodeToDelete.next;
                    sumOfNodeVal += (nodeToDelete != null ?  nodeToDelete.val : 0);
                }
                targetNode.next = node.next;


            }
            else{
                prefixSumMap.put(prefixSum,node);
            }

            node = node.next;
        }


        return res.next;
    }
}
