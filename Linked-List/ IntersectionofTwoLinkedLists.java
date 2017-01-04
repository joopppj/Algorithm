public class IntersectionofTwoLinkedLists{   // question : find where intersection part of two linked lists starts . return null if  they do not have intersection.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA), lenB = length(headB);
    while (lenA > lenB) {　　　　// if A is longer
        headA = headA.next;
        lenA--;
    }
    while (lenA < lenB) {       // if B is longer
        headB = headB.next;
        lenB--;
    }
    // find the intersection until end
    while (headA != headB) {        // stop when the intersection part is found 
        headA = headA.next;
        headB = headB.next;
    }
    return headA;
}

private int length(ListNode node) {          // get length of listNode
    int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
    }
}
