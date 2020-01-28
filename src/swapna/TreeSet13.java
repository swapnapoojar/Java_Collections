package swapna;

import java.util.TreeSet;

public class TreeSet13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1= new TreeSet();
		t1.add(1);
		t1.add(7);
		t1.add(8);
		t1.add(78);
		t1.add(5);
		System.out.println("Strictly than or  equal to  6:"+ t1.lower(6));
		System.out.println("Strictly than or  equal to 78:"+ t1.lower(78));

	}

}
