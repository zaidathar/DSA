class Solution {

    private static ListNode recursiveReverse(ListNode head){
        if( head == null || head.next == null)
            return head;
        ListNode h = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return h;
    }

    private static ListNode iterativeReverse(ListNode head){
        ListNode h = null;

        while(head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = h;
            h = temp;
            head = head.next;

        }

        return h;
    }
    public ListNode reverseList(ListNode head) {
       	// return iterativeReverse(head);
	 return recursiveReverse(head);
    }
}
