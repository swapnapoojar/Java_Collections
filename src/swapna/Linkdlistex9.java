package swapna;

import java.util.LinkedList;

public class Linkdlistex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println("elements"+l1);
		//l1.addLast(15);
		//l1.addFirst("S");
		l1.add(4, "Hi");
		System.out.println("after adding:"+l1);
	}

}
