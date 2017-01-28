package test;

import java.util.HashSet;

public class DeleteDups{
	// remove duplicates from a unsorted linked list 
	void DeleteDups(LinkedListNode n){
		HashSet<Integer> set= new HashSet<Integer>();
		LinkedListNode previous = null;
		while(n!=null){
			if(set.contains(n.data)){
				previous.next=n.next;
			}else{
				set.add(n.data);
				previous =n;
			}
			n=n.next;
		}
	}
}