class Solution {

    private static ListNode reverse(ListNode node){
        ListNode head = null;
        ListNode n = node;

        while(n != null){
            ListNode temp = new ListNode(n.val);
            temp.next = head;
            head = temp;
            n = n.next;
        }

        return head;
    }

    private static boolean isEqual(ListNode first , ListNode second){

        while(first != null && second != null){
            if(first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }

        return first == null && second == null;
    }

    private static boolean recursiveApproach(ListNode head){
         ListNode reversed = reverse(head);
        return isEqual(head, reversed);
    }

    private static boolean iterativeApproach(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        Stack<Integer> stack = new Stack();

        while(fast != null && fast.next != null){
            stack.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }

        // Odd number of elements , skip middle element
        if(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            int top = stack.pop().intValue();

            if(top != slow.val)
                return false;

            slow = slow.next;
        }

        return true;
    }
    public boolean isPalindrome(ListNode head) {
        return iterativeApproach(head);
    //    return recursiveApproach(head);

    
    }
}
