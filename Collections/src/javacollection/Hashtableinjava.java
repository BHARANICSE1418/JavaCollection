package javacollection;

import java.util.Hashtable;
import java.util.Map;

public class Hashtableinjava {

	 
	/*
	 * A Hashtable is an array of a list. Each list is known as a bucket. The
	 * position of the bucket is identified by calling the hashcode() method. A
	 * Hashtable contains values based on the key. Java Hashtable class contains
	 * unique elements. Java Hashtable class doesn't allow null key or value. Java
	 * Hashtable class is synchronized.
	 */
	public static void main(String[] args) {
		
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  hm.remove(102);  
	       System.out.println("After remove: "+ hm); 
	       System.out.println(hm.getOrDefault(101, "Not Found"));  
	       System.out.println(hm.getOrDefault(105, "Not Found")); 
	       System.out.println("+++++++++++++++++++++++");
	       hm.putIfAbsent(101,"Vijay");  
	       System.out.println("Updated Map: "+hm);  
		

	}

}
