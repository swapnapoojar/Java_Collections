package swapna;

import java.util.HashSet;

public class Hashsetex10 {

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
		HashSet<Integer> h2=new HashSet<Integer>();
		h2.add(24);
		h2.add(4);
		HashSet<Integer> s=new HashSet<Integer>();
		for(Integer e: h1)
			System.out.println(h2.contains(e)? "same":"different");
		
		
	}

}
