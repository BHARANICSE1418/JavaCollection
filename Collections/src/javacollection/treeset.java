package javacollection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset 
{
	
	//Java TreeSet class contains unique elements only like HashSet.
	//Java TreeSet class access and retrieval times are quiet fast.
	//ava TreeSet class doesn't allow null element.
	//Java TreeSet class is non synchronized.
	//Java TreeSet class maintains ascending order.
	//Java TreeSet class contains unique elements only like HashSet
	//Java TreeSet class access and retrieval times are quite fast.
	//Java TreeSet class doesn't allow null elements.
	//Java TreeSet class is non-synchronized.
	//Java TreeSet class maintains ascending order.
	//The TreeSet can only allow those generic types that are comparable. 
	//For example The Comparable interface is being implemented by the StringBuffer class.

	public static void main(String[] args) 
	{
		

		TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  //al.add(null);
		  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());
		  }
		  
		  System.out.println("Traversing element through Iterator in descending order");  
	         Iterator k=al.descendingIterator();  
	         while(k.hasNext())  
	         {  
	             System.out.println(k.next());  
	         } 
	         TreeSet<Integer> set=new TreeSet<Integer>();    
	         set.add(24);    
	         set.add(66);    
	         set.add(2);    
	         set.add(15);    
	         System.out.println("Lowest Value: "+set.pollFirst());    
	         System.out.println("Highest Value: "+set.pollLast()); 
    	
	
	TreeSet<String> set1=new TreeSet<String>();  
    set1.add("A");  
    set1.add("B");  
    set1.add("C");  
    set1.add("D");  
    set1.add("E"); 
    //set1.add(null);
    System.out.println("Initial Set: "+set1);  
      
    System.out.println("Reverse Set: "+set1.descendingSet());  
      
    System.out.println("Head Set: "+set1.headSet("C", true));  
     
    System.out.println("SubSet: "+set1.subSet("A", false, "E", true));  
      
    System.out.println("TailSet: "+set1.tailSet("C", false));  
	}			  

}
