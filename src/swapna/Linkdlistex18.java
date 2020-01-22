package swapna;

import java.util.LinkedList;

public class Linkdlistex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		LinkedList l2= new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(2);
		l1.add(2);
		l1.add(2);
		System.out.println("elements"+l1);
		 l2= (LinkedList)l1.clone();
		System.out.println("after clone to list2:"+l2);
	
	}

}
