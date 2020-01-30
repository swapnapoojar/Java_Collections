package swapna;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> t1=new TreeMap();
		t1.put(1, "H");
		t1.put(2,"K");
		t1.put(3,"S");
		t1.put(4, "D");
		System.out.println("First: "+t1);
		TreeMap<Integer,String> t2=new TreeMap();
		t2.put(5, "1");
		t2.put(6, "2");
		t2.put(7, "2");
		System.out.println("Second: "+t2);
		t2.putAll(t1);
		System.out.println("After copying:"+t2);
	}

}
