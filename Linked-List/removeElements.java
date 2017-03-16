public class removeElements {
    // remove nodes with target values in a given linked list. and return the linked list .
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        ListNode pre=head;
        while(pre!=null&&pre.val==val){
            pre=pre.next;
        }
        if(pre==null) return null;
        ListNode res=pre;
        ListNode next=pre.next;
        if(next==null)return pre.val==val?null:pre;
        while (next!=null){
            if(next.val==val){
                while (next!=null&&next.val==val){
                    next=next.next;
                    pre.next=next;
                }
            }
            if(next!=null)next=next.next;
            if(pre!=null)pre=pre.next;
        }
        return res;
    }
    // overall , it is a  simple linked list question, but it has some edges case which are hard to be considered at first . 
}
