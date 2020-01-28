package swapna;

import java.util.TreeSet;

public class TreeSet6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1= new TreeSet();
		t1.add("H");
		t1.add("A");
		t1.add("B");
		t1.add("Y");
		t1.add("P");
		System.out.println(t1);
		TreeSet t2=new TreeSet();
		t2 =(TreeSet) t1.clone();
		System.out.println("cloned:"+t2);
	}

}
