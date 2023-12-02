package javacollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
	/*
	 * Java LinkedHashMap class is Hashtable and Linked list implementation of the
	 * Map interface Java LinkedHashMap contains values based on the key. Java
	 * LinkedHashMap contains unique elements. Java LinkedHashMap may have one null
	 * key and multiple null values. Java LinkedHashMap is non synchronized. Java
	 * LinkedHashMap maintains insertion order.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> linkedhashmap=new LinkedHashMap<Integer,String>();  
		  
		linkedhashmap.put(100,"Amit");  
		linkedhashmap.put(101,"Vijay");  
		linkedhashmap.put(102,"Rahul");  
		linkedhashmap.put(105,"bharani");
		  
		for(Map.Entry m:linkedhashmap.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	       System.out.println("Keys: "+linkedhashmap.keySet());  

	       System.out.println("Values: "+linkedhashmap.values());  
	       System.out.println("Key-Value pairs: "+linkedhashmap.entrySet()); 
	       
	       linkedhashmap.remove(105);
	       System.out.println("Key-Value pairs: "+linkedhashmap); 
	       


	}

}
