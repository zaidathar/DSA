class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode h = null;

        while(head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = h;
            h = temp;
            head = head.next;

        }

        return h;
    }
}
