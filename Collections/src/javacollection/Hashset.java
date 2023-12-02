package javacollection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	
	/*
	 * 1.It inherits the AbstractSet class and implements Set interface. 
	 * HashSet stores the elements by using a mechanism called hashing. 
	 * HashSet allows null value
	 * HashSet class is non synchronized.
	 * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
	 * HashSet is the best approach for search operations.
	 * The initial default capacity of HashSet is 16, and the load factor is 0.75.
	 */
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		HashSet <String> set= new HashSet<String>();
		
		set.add("bharani");
		set.add("indhumath");
		set.add("Murugesan");
		set.add("thilaga");
		set.add("kirich");
		set.add("arun");
		set.add("arun");
		//set.add(null);	
		set.add("unknown");
		for(String n: set)
		{
			System.out.println(n);
		}
		System.out.println("*******3****************************");
	    
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
		
		System.out.println("***********************************");

		set.remove("unknown");
		System.out.println(set);
		System.out.println("**************23423*********************");

		HashSet<String> set1=new HashSet<String>();  
        set1.add("Ajay");  
        set1.add("Gaurav");  
        set.addAll(set1);  
        System.out.println("Updated List: "+set);  
        
        set.removeIf(str->str.contains("Ajay"));    
        System.out.println("After invoking removeIf() method: "+set); 
        set.clear();  
        System.out.println("After invoking clear() method: "+set);  
        
        
 
	
	
	    
		
	}

}
