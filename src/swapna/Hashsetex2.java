package swapna;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1= new HashSet();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(87);
		h1.add(5);
		//h1.add(5); duplicates are not allowed.
		Iterator<Integer> i1= h1.iterator();
		while (i1.hasNext())
		{
			
			System.out.println("iterated items= "+i1.next());
		}
	}

}
