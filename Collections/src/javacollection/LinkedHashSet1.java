package javacollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
	
	/*
	 * Java LinkedHashSet class is a Hashtable and Linked list implementation of the
	 * Set interface Java LinkedHashSet class contains unique elements only like
	 * HashSet. Java LinkedHashSet class provides all optional set operations and
	 * permits null elements. Java LinkedHashSet class is non-synchronized. Java
	 * LinkedHashSet class maintains insertion order.
	 */

	public static void main(String args[]) {

		  LinkedHashSet<String> set=new LinkedHashSet<String>();  
          set.add("One");    
          set.add("Two");    
          set.add("Three");   
          set.add("Four");  
          set.add("Five"); 
          set.add(null);
          Iterator<String> i=set.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  
          System.out.println("//////////////");
          LinkedHashSet<String> set1=new LinkedHashSet<String>();
          set1.add("One");    
          set1.add("Two");    
          set1.add("Three");   
          set1.add("Four");  
          set1.add("Five");  
          set1.add("Five");
          set1.add("six");
          set1.add(null);
          Iterator<String> l=set1.iterator();  
          while(l.hasNext())  
          {  
          System.out.println(l.next());  
          }  
          System.out.println("++++++++++++++");
          set1.remove("six");
          System.out.println("After removing the element, the hash set is: " + set1);  

		

	}	

}
