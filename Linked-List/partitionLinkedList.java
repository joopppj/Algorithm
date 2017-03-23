public class partitionLinkedList {
//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

//You should preserve the original relative order of the nodes in each of the two partitions.
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);  //dummy heads of the 1st and 2nd queues
        ListNode curr1 = dummy1, curr2 = dummy2;      //current tails of the two queues;
        while (head!=null){
            if (head.val<x) {
            curr1.next = head;
            curr1 = head;
        }else {
            curr2.next = head;
            curr2 = head;
        }
            head = head.next;
        }
        curr2.next = null;          //important! avoid cycle in linked list. otherwise u will get TLE.
        curr1.next = dummy2.next;
        return dummy1.next;
        //use two queue two record two subparts of the final result  , one for elements smaller and one for elements larger
    }
}
