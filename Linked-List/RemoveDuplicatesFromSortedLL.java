public class RemoveDuplicatesFromSortedLL {
    //question:Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){            // move the pointer of pre
                pre=pre.next;
            }
            else{                         //this is used to avoid duplicates(if cur is distinc, this statement would not be called)
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    }
}
