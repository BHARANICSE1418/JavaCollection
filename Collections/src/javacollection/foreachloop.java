package javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class foreachloop {

	public static void main(String[] args) {
	
		String[] hai = { "unknown", "Bharani", "Indhu", "Arun", "Thilaga", "Murugesan" };
		Arrays.sort(hai);
		for(Object s: hai)
		{
		System.out.println(s);
		}
		
		ArrayList kl= new ArrayList();
		kl.add("unknown");
		kl.add("Bharani");
		kl.add("Arun");
		kl.add("indhu");
		System.out.println(kl);
 
		for(Object s1: kl)
		{
		System.out.println(s1);
		}
		
		
		
		
		
		System.out.println("************");
		Iterator it= kl.iterator();
		while(it.hasNext())
		
		{
			
			System.out.println(it.next());
		}
		System.out.println("******7777777*****");
		
		Iterator it1= kl.iterator();
		while(it1.hasNext())
		{
			
			  if (it1.next().equals("unknown")) 
			it1.remove();
			  
		}
		System.out.println(kl);
		
		
		
		
		
		
		System.out.println("***********-*********");

		ListIterator li= kl.listIterator();
		
		 li.add("love"); li.add("family");
		 
		System.out.println(kl);
		
		System.out.println("***********---///");
		while(li.hasNext())
		{
			
			  if (li.next().equals("Arun")) 
			  {
				  li.set("unknown");
			  }

    	}	
		System.out.println(kl);

		
		
		
		
		/*For each
		 * only forward direction
		 * no removal
		 * 
		 * Iteartor
		 * Forward
		 * Removing is possible
		 * 
		 * Listiteartor
		 * Bidirectional
		 * can move forward and backword
		 * read/replace/add/remove
		
		
		
		
		
		*/
	}

}
