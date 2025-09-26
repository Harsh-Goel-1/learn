package DSA;

import java.util.LinkedList;
import java.util.Queue;
public class queues {

	public static void main(String[] args) {
		
		//Queue- FIFO data structure -- first in first out
		//it is linear data structure (Eg- line of people in walmart)
		//a collection designed to hold objects prior to processing

		//add() = enqueue , offer()
		//remove() = dequeue , poll()
		//element() = peek, peek()		
//         ^				  ^
//         |				  |
//  throws exception    returns special value
		
		//hover over "Queue" in blue for more information 	
		
		//-----------******-------------------
		
		//Since queue interface extends collection interface
		//we can use the meothods defined in collection in queue
		
		Queue<String> queue= new LinkedList<String>();
		System.out.println(queue.isEmpty());
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Herold");
		System.out.println(queue.size());
		System.out.println(queue.contains("Herold"));
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		//queue.poll();
		//queue.poll();
		System.out.println(queue);
		queue.poll();
		//queue.remove(); will give exception
		//queue.poll(); will not give exception and keep the queue empty
		
		//where ae queues useful?
		//1.keyboard buffer(characters are waiting for their turn to be displayed when typing too fast)
		//2.printer queues 
		//3.in LinkedLists, PriorityQueues, Breadth-first search 
		
	}

}
