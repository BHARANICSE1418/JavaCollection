package javacollection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	/*
	 * Java HashMap class implements the Map interface which allows us to store key
	 * and value pair, Java HashMap contains values based on the key.
	 * Java HashMap contains only unique keys.
	 * Java HashMap may have one null key and multiple null values.
	 * Java HashMap is non synchronized.
	 * Java HashMap maintains no order.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();//Creating HashMap    
		hashmap.put(1,"Mango");  //Put elements in Map  
		hashmap.put(2,"Apple");    
		hashmap.put(3,"Banana");   
		hashmap.put(4,"Grapes");   
		hashmap.put(5,null); 
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry map : hashmap.entrySet())
		   {    
		    System.out.println(map.getKey()+" "+map.getValue());    
		   }  
		   
		   HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();//Creating HashMap    
		   hashmap1.put(1,"Mango");  //Put elements in Map  
		   hashmap1.put(2,"Apple");    
		   hashmap1.put(3,"Banana");   
		   hashmap1.put(1,"Grapes"); //trying duplicate key  
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m1 : hashmap1.entrySet()){    
		    System.out.println(m1.getKey()+" "+m1.getValue());    
		   }
		   System.out.println("-------------");
		   hashmap1.put(104,"Ravi");
		   hashmap1.put(103,"Gaurav");
		      for(Map.Entry m:hashmap1.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          } 
		      
		      hashmap1.remove(104);  
		      System.out.println("Updated list of elements: "+hashmap1);
		      
		      System.out.println("+++++++++++++++++");
		      hashmap1.replace(2, "Apple", "Gova");  
		      for(Map.Entry m:hashmap1.entrySet())  
		      {  
		         System.out.println(m.getKey()+" "+m.getValue());   
		      }   

	}

}
