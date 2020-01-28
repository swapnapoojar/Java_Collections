package swapna;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashsetex7 {

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
		int[] array= new int [h1.size()];
		h1.toArray();
		System.out.println("array");
		for(Integer ele: array)
		System.out.println(ele);
	}
}
