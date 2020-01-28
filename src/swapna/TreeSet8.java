package swapna;

import java.util.TreeSet;

public class TreeSet8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t1= new TreeSet<String>();
		t1.add("H");
		t1.add("A");
		t1.add("B");
		t1.add("Y");
		t1.add("P");
		System.out.println(t1);
		
		TreeSet t2= new TreeSet();
		t2.add("H");
		t2.add("A");
		t2.add("B");
		t2.add("Y");
		t2.add("P");
		System.out.println(t2);
		
		TreeSet<String> t3=new TreeSet();
		for(String e: t1)
			System.out.println(t2.contains(e) ? "yes":"no");

	}

}
