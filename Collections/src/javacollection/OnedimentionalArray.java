package javacollection;

public class OnedimentionalArray {
	
	/*
	 * A One-Dimensional Array is a group of elements having the same data type
	 * which are stored in a linear arrangement under a single variable name.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];  //declaration
		
		a[0]=10;//initialization  
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
