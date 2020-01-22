package swapna;

import java.util.Collections;
import java.util.LinkedList;

public class Linkdlistex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println("elements"+l1);
		Collections.shuffle(l1);
		System.out.println("AFter shuffle"+l1);
		
	}

}
