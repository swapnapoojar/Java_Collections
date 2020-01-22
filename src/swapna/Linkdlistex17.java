package swapna;

import java.util.LinkedList;

public class Linkdlistex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		LinkedList l2= new LinkedList();
		LinkedList l3= new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l2.add(6);
		l2.add(7);
		System.out.println("first list:"+l1);
		System.out.println("second list:"+l2);
		l3.addAll(l1);
		l3.addAll(l2);
		System.out.println("Final list is:"+l3);
	}

}
