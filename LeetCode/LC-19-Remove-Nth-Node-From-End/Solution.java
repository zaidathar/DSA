class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode();
        temp.next = head;

        ListNode r = head ;
        ListNode l = temp;

        for(int i = 0 ;i<n; i++){
            r = r.next;
        }

        while(r != null){
            l = l.next;
            r = r.next;
        }
        ListNode nxt = l.next;
        l.next = l.next.next;
        nxt.next = null;

        return temp.next;
    }
}
