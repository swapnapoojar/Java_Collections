package swapna;

import java.util.HashSet;

public class Hashsetex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1= new HashSet();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(87);
		h1.add(5);
		//h1.add(5); duplicates are not allowed.
		
		System.out.println(h1);
		h1.removeAll(h1);
		System.out.println(h1);
	}

}
