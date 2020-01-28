package swapna;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1= new TreeSet();
		t1.add("H");
		t1.add("A");
		t1.add("B");
		t1.add("Y");
		t1.add("P");
		System.out.println("First:"+t1);
		Iterator it= t1.descendingIterator();
		System.out.println("reverse order set is:");
		while(it.hasNext())
			System.out.println(it.next());

	}

}
