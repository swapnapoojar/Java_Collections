package swapna;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t1= new TreeSet();
		TreeSet<Integer> t2= new TreeSet();
		t1.add(1);
		t1.add(7);
		t1.add(8);
		t1.add(78);
		t1.add(5);
		System.out.println(t1);
		t2=(TreeSet)t1.headSet(7);
		Iterator it= t2.iterator();
		System.out.println("less than 7 elements are: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
