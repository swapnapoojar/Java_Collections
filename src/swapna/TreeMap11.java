package swapna;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> t1=new TreeMap();
		t1.put(5, "H");
		t1.put(2,"K");
		t1.put(3,"S");
		t1.put(4, "D");
		System.out.println("check for least:"+t1.floorEntry(2));
		System.out.println("check for equal:"+t1.floorEntry(3));
		System.out.println("check for greater:"+t1.floorEntry(6));
	}

}
