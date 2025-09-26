package DSA;

import java.util.*;

public class linkedlists {
	
	// ArrayLists are a series of input with indexing done, it is hard to add/remove items in arrays/arraylists but ez to search
	// linkedLists provide ez add/remove but searching is a pain since no indexing is done
	// linked list has nodes which store data and address to the next node, we can not directly access elements like in array
	
	// Imagine yeeting third element in an array of million elements then running a loop for shifting values,
	// well that can be done easily with linked lists by changing the address of the pointer of second element to fourth element directly
	
	// *****************************************************
	  
	  // LinkedList =  Nodes are in 2 parts (data + address)
	  // Nodes are in non-consecutive memory locations(memory can be allocated anywhere since address is there in the node itself)
	  // Elements are linked using pointers
	
		//						Singly Linked List
		//			Node				Node 				Node
	    //		[data | address] -> [data | address] -> [data | address]  
	
		//								    Doubly Linked List
		//			  Node					        Node						  Node
		//	[address| data | address] <-> [address| data | address] <-> [address| data | address]
	
		/*  Doubly linked list lets us traverse through the list from head to tail and tail to head both,
		 *  but it requires more memory since we need to store two addresses  */
	
	  //    advantages?
	  //    1. Dynamic Data Structure (allocates needed memory while running)
	  //    2. Insertion and Deletion of Nodes is easy. O(1) 
	  //    3. No/Low memory waste
	  
	  //    disadvantages?
	  //    1. Greater memory usage (additional pointer)
	  //    2. No random access of elements (no index [i])
	  //    3. Accessing/searching elements is more time consuming. O(n)
	  
	  //    uses?
	  //    1. implement Stacks/Queues
	  //    2. GPS navigation(multiple locations at once)
	  //    3. music playlist
	  //
	  
	  // *****************************************************
	  
	  //LinkedLists are useful when we have a huge data set with a lot of add/remove of elements needed
	  //they are time consuming when searching for elements so avoid using them for search needing list
	  //do not use linkedlist for small data set since arrays will work just fine, requiring way less memory and being efficient

	public static void main(String[] args) {
		
		LinkedList<String> list= new LinkedList<String>();
		
		/* In definition of LinkedList(access by hovering your cursor over "LinkedList" text in blue),
		   it is written that it implements Deque(pronounce as Deck) which is essentially a double ended queue
		   so with the Deque interface we implement 12 additional methods(add,offer,poll na all)
		   it implements other interfaces too go check em out
		   */
		
		//we can treat linkedlist like a stack or a queue
		/*
		list.push("A");
		list.push("B");
		list.push("D");
		list.push("E");
		list.push("F");
		list.push("G");
		list.push("heheheehehehh");
		list.pop();
		list.add(1,"C");
		list.remove("A");
		System.out.println(list);
		
		System.out.println(list.peekLast()); is a function not present in stack but present in linkedlist 
		Last,First after every method is available in linkedlist
		
		the approach of printing and indexing is reverse of stack though
		*/
		list.offer("Ashutosh");
		list.offer("Ahush");
		list.offer("Ash");
		list.offer("hutosh");
		list.pop();//we use poll() in queues
		System.out.println(list);
		//similarly queues can also be implemented using linkedlists
		//BUT approach of printing/popping n all are like in queues only not stacks
		
		
		
	}

}
