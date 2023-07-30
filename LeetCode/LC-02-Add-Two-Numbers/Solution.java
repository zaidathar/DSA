class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1 ;
        ListNode head2 = l2;
        ListNode res = null , resHead = null;
        int carry = 0;
        
        while(true){
            int temp = carry;
            if(head1==null && head2==null)break;
            if(head1!=null){
                temp+=head1.val;
                head1 = head1.next;
            }
            if(head2!=null){
                temp+=head2.val;
                head2 = head2.next;
            }
            carry =0;
            if(temp > 9){
                carry = temp/10;
                temp = temp%10;
                
            }
            // System.out.println(temp);
            ListNode newNode = new ListNode(temp);
           
            if(res==null){
                res=newNode;
                resHead = res;
            }
            else{
                resHead.next = newNode;
                resHead = resHead.next;
            }
            
        }
        if(carry >0 ){
            ListNode tail = new ListNode(carry);
            resHead.next = tail;
        }
        return res;
    }
}
