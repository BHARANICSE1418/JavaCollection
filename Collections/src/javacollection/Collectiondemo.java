package javacollection;

import java.util.ArrayList;
import java.util.Collections;

public class Collectiondemo {

	public static void main(String[] args) {
	
		ArrayList bh=new ArrayList();
		
	    bh.add('u');
	    bh.add('n');
	    bh.add('k');
	    bh.add('n');
	    bh.add('o');
	    bh.add('w');
	    bh.add('n');
        System.out.println(bh);
        
        Collections.sort(bh);
        System.out.println(bh);
        
       System.out.println(Collections.binarySearch(bh, 'u'));
        
        
	}

}
