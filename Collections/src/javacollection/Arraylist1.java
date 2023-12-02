package javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		/* Array is collection of similar data type
		 * Array is sizable
		 * Array list is resizable
		 * Heterogeneous objects
		 * Data structure : growable Array
		 * Class - Package, Constructor, Methods, Variable
		 * Get() and remove()
		 * both will return us the element present in particular index
		 * get() will not remove the particular element from the ArrayList
		 * remove() will remove the particular element from the ArrayList 
		 * 
		 */
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(20);
		System.out.println(al);
		
		al.add(60); 
		al.add(true);
		al.add("C");
		al.add(null);
		al.add(10.5);
		System.out.println(al);
		
		System.out.println("Arraylist size=  "+al.size());
		
		al.add(9, "Bharani"); // add a element
		System.out.println("Add a element=  "+al);
		
		al.remove(8);
		System.out.println("remove a element=  "+al);
		
		System.out.println("Verify element present=  "+al.contains("unknown"));
		
		
		System.out.println("get an element=  "+al.get(7));
		
		al.set(9, 10.8);
		System.out.println("Set is used to set the element in particualr position=  "+al);
		
		System.out.println("index position is=   "+al.indexOf("Bharani"));
		
		System.out.println("The clone Arraylist is= "+al.clone());
		
		ArrayList al2= new ArrayList();
		
		al2.add("Chennai");
		al2.add("Bangalore");
		System.out.println(al2);
		
		
		 al2.addAll(0,al);
		 System.out.println("Add ah new array list from old list=  "+al2);
		 
		 List al3=al2.subList(1, 6);
		 System.out.println(al3);
		 
		 ArrayList loop= new ArrayList();
		 for(int i=0;i<10;i++)
		 {
			 loop.add(i*11);
		 }
		 System.out.println(loop);
		  
		 
		 
		 
		 
		
		
		

		

		

	}

}
