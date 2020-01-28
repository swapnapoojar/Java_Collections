package swapna;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Hashsetex9 {

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
		List<Integer> l1= new ArrayList<Integer>(h1);
		//System.out.println(l1);
		for(Integer e: l1)
		{
			System.out.println(e);
		}
		
		
	}

}
