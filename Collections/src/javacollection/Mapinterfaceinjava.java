package javacollection;

import java.util.HashMap;
import java.util.Map;

public class Mapinterfaceinjava {
	
	/*
	 * A Map is useful if you have to search, update or delete elements on the basis
	 * of a key
	 * A Map doesn't allow duplicate keys, but you can have duplicate values.
	 * 
	 */

	public static void main(String[] args) {


		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");
		  map.put(null, null);
		  map.put(100,"Amith");
		  map.put(null, null);
		  map.put(null,"BAN");
		  map.put(105, "BAN");
		  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());}  
	}

}
