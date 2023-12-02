   package javacollection;

import java.util.Arrays;

public class Arraybasics {
	
	//Array is collection or group of smilier typed varable
	//it can be staored under common name
	//one dimentional array, two dimentional array and multi dimentional array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int[] a= {10,20,30};
		 	int[] b= {30,20,10};
		 	System.out.println(Arrays.equals(a, b));
		 	
		 	Arrays.sort(b);
		 	for(int i: b)
		 	System.out.println(i);
		 	
		 	System.out.println(Arrays.equals(a, b));
		 	System.out.println("*******************");
		 	String[] name= {"Harithra","Bharani", "Indhu","Arun","Thilaga","Murugesan"};
		 	Arrays.sort(name);
		 	for(String l: name)
		 	System.out.println(l);
		 	
		 	System.out.println("*********After sorting**********");
		 	
		 	sorting3comparator p= new sorting3comparator();
		 	Arrays.sort(name, p);

		 	for(String na: name)
				System.out.println(na);
		 	
		 	
		 	
		 	
		 	

	}

}
