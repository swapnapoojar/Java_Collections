package swapna;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashsetex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h1= new HashSet<Integer>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(87);
		h1.add(5);
		//h1.add(5); duplicates are not allowed.
		System.out.println(h1);
		Set<Integer> s=new TreeSet<Integer>(h1);
		System.out.println(s);
		for(Integer e: s)
		{
			System.out.println(e);
		}
	}

}
