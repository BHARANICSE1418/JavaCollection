package javacollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeueinjava {
	
	
	/*
	 * deque supports First In First Out and Last In First Out we can add or remove
	 * elements from both sides Null elements are not allowed in the ArrayDeque.
	 * ArrayDeque is not thread safe, in the absence of external synchronization.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay"); 
		   deque.offer("Savi");
		   deque.offer("Savi");
		  // deque.add(null);  //not allow the null values
		 
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  
		   
		   deque.remove("Savi");
		   System.out.println(deque);
		   
		   deque.offerFirst("jai"); 
		   deque.offerLast("mari");
		   deque.offerLast("mari");
		   //deque.offerLast(null);
		
		   System.out.println(deque);
		   
		   
		   

	}

}
