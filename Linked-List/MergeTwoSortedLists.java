class solution{
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}}
     // the core idea of this algorithm is recursion  which helps merge two single nodes
public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
	ListNode result = new ListNode(0);
	          ListNode tmp = result;
	          if (l1 == null) {
	              return l2;
	          }
	          if (l2 == null) {
	              return l1;
	          }
	         
	          while(l1!=null&&l2!=null){
	              if (l1.val>l2.val){result.next = l2;l2=l2.next;}
	              else {result.next = l1;l1=l1.next;}
	              result=result.next;
	          }
	          if (l1==null){
	              result.next=l2;
	          }
	          else if(l2==null){
	              result.next=l1;
	          }
	          return tmp.next;
}
   // this is the general solution, it actually works better than first one because its complexity is shorter length of l1 and l2
