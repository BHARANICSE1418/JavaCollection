package javacollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		
		/*
		ArrayList:
		
		         Element retrieval is faster
		         Element Insertion/ deletion is low speed
		         
		         project la na lot of data va poi eaduthu varanuna arraylist is better
		
		LinkedList
		
		           Element retrieval is slow
		           Element Insertion/ deletion is faster
		           
		           Project la na data ah adikadi maathidu irrukana Linkedlist is better
		
		        
		
		*/
		
		LinkedList ll=new LinkedList();
		
		ll.add(10);
		ll.add(50);
		ll.add(40);
		ll.add(30);
		ll.add(20);
		ll.add(20);
		ll.add(null);
		System.out.println(ll);
		
		System.out.println("boolean value  "+ll.add(60)); // boolean concept

		ll.add(true);
		ll.add("C");
		ll.add("jari ");
		ll.add(10.5);
		System.out.println(ll);
		
		System.out.println("Linkedlist size=  "+ll.size());
		
		ll.add(9, "Dream"); // add a element
		
		ll.addFirst("Bharani");
		ll.addLast("deepan");
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		
		ll.offerFirst(1.5);
		System.out.println(ll);
		
		ll.offerLast(1000);
		System.out.println(ll);
		
		ll.pollLast();
		System.out.println(ll);
		ll.pollFirst();
		System.out.println(ll);
		System.out.println(ll.getFirst());
		


		
	}

}
