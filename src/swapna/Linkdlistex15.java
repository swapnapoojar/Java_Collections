package swapna;

import java.util.Collections;
import java.util.LinkedList;

public class Linkdlistex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		//Collections.swap(l1, 0, 4);
		System.out.println("before"+l1);
		Collections.swap(l1, 1, 2);
		System.out.println("After"+l1);
	}

}
