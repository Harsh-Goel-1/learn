package DSA;

import java.util.*;
public class priority_queues {
	public static void main(String args[]) {
		
		//PriorityQueue is a FIFO data structure(first in first out)
		//elements are arranged in priority order in this
		
		Queue<Double> queue=new PriorityQueue<>(Collections.reverseOrder());
		//comparator is advanced stuff... Collection.reverseOrder() is default comparator
		queue.offer(1.0);
		queue.offer(2.5);
		queue.offer(2.0);
		queue.offer(1.5);
		queue.offer(0.0);
		
		while(queue.isEmpty()==false) {
			System.out.println(queue.poll());
		}
		
		Queue<String> q=new PriorityQueue<>();
		q.offer("Harsh");
		q.offer("Krishna");
		q.offer("Sahil");
		q.offer("Ashutosh");
		q.offer("Sachin");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
