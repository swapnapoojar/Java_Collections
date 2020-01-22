package swapna;

import java.util.ArrayList;

public class Arrayex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add(1);
		a.add(2);
		a.add(4);
		System.out.println("first array"+a);
		ArrayList b = new ArrayList();
		b.add("A");
		b.add(5);
		
		//b.addAll(a);
		System.out.println("second array"+b);
		ArrayList c = new ArrayList();
		c.addAll(a);
		c.addAll(b);
		System.out.println("Third Array"+c);
	}

}
