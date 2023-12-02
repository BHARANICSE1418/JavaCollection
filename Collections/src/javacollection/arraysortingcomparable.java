package javacollection;

import java.util.Arrays;
import java.util.Comparator;

public class arraysortingcomparable 
{

	public static void main(String[] args) 
	{
		
		String[] so = { "unknown", "Bharani", "Indhu", "Arun", "Thilaga", "Murugesan" };
		Arrays.sort(so);
		for (String sor : so)
			System.out.println(sor);
		int[] so1 = {1,4,6,3,6,8,3 };
		Arrays.sort(so1);
		for (int sor1 : so1)
			System.out.println(sor1);


		System.out.println("*********After sorting**********");

		
		// compared sortlenght = new compared(); 
		// Arrays.sort(so, sortlenght);
      sorting3comparator kl= new sorting3comparator();
      Arrays.sort(so,kl);
		 for(String sa: so) 
			System.out.println(sa);
		 
		 
	}
}
