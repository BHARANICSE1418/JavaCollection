package javacollection;

import java.util.Comparator;

public class sorting3comparator implements Comparator {


	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		int result = s1.compareTo(s2);
		if (result>0)
			return -1;
		else if (result<0)
			return +1;
		else
		return 0;
	}

}
