package javacollection;

import java.util.Arrays;
import java.util.Comparator;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before sorting");
		int[] arr= {3,9,34,47,1,87};
		for(int i: arr)
		System.out.println(i);
		Arrays.sort(arr);
		System.out.println("after sorting-------------");
		for(int i: arr)
		System.out.println(i);
		
		
		String[] arrstr= {"unknown","Bharani", "Indhu","Arun","Thilaga","Murugesan"};
		System.out.println("Before sorting");
        for(String j: arrstr)
		System.out.println(j);
        Arrays.sort(arrstr);
		// sort(object a)
        System.out.println("after sorting--------------");
		for(String j: arrstr)
		System.out.println(j);
		
		Comparator comp = new sorting2comparator(); //comparator class
		Arrays.sort(arrstr, comp);
		
		System.out.println("********afte copare method**********");
		for(String k: arrstr)
			System.out.println(k);
		
        
	}

}
