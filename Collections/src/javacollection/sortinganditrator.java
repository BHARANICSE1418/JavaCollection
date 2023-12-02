package javacollection;

import java.util.ArrayList;
import java.util.Iterator;

public class sortinganditrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		Iterator it= kl.iterator();
		while(it.hasNext())
		
		{
			
			System.out.println(it.next());
		}
	}

}
