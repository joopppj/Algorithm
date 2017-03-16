/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleII {
// Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
                ListNode fast = head;
        
                while (fast!=null && fast.next!=null){
                    fast = fast.next.next;
                    slow = slow.next;
                    
                    if (fast == slow){
                        ListNode slow2 = head; 
                        while (slow2 != slow){
                            slow = slow.next;
                            slow2 = slow2.next;
                        }
                        return slow;
                    }
                }
        return null; 
    }
    // a hard linked-list questions .  firstly we need to use technique we used in normal LinkedListCycle question. (a slow and a fast pointer)
    // then we need to understand how much does slow and fast pointers run already. assume slow already run a+b and fast already run a+2b+c (a represents length between start point and entry of loop,b represents length has slow pointer run in the loop. c+b is obvious ly the length of the loop )
     // then c=a .  we create a new pointer starts at 1st node.  the new node and the slow pointer will meet at entry of the loop obviously 
}
