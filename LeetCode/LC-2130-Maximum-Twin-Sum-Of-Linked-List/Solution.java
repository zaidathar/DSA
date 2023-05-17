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
    public int pairSum(ListNode head) {
        
        List<Integer> res = new ArrayList<>();
        while(head != null){
            res.add(head.val);
            head = head.next;
        }
        int maxSum = Integer.MIN_VALUE;
        int front=0,back = res.size()-1;

        while(front < back){
            int twinSum = res.get(front) + res.get(back);
            maxSum = maxSum < twinSum ? twinSum : maxSum;
            front++;back--;
        }

        return maxSum;
    }
}
