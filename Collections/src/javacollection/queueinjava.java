package javacollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queueinjava 
{

	/*
	 * The interface Queue is available in the java.util package and does extend the
	 * Collection interface. It is used to keep the elements that are processed in
	 * the First In First Out (FIFO) manner. It is an ordered list of objects, where
	 * insertion of elements occurs at the end of the list, and removal of elements
	 * occur at the beginning of the list.
	 */
	
	
	public static void main(String[] args)
	{
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  //It is used to insert the specified element into this queue and return true upon success.
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");
		queue.add("Rahul");
		//queue.add(null); null not allowed in queue
		System.out.println("head:"+queue.element()); //It is used to retrieves, but does not remove, the head of this queue.
		
		
		PriorityQueue<String> queue1=new PriorityQueue<String>();  
		  
		queue1.add("Vijay");  
		queue1.add("Karan");  
		queue1.add("Jai");  
		queue1.add("Rahul");  
		System.out.println("head:"+queue1.peek()); //It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. 
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		queue1.remove(); //It is used to retrieves and removes the head of this queue.
		System.out.println(queue1);
		
		queue1.poll(); //It is used to retrieves and removes the head of this queue, or returns null if this queue is empty. 
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue1.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next()); 
		}
		}

}
