package swapna;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> t1=new TreeMap();
		t1.put(1, "H");
		t1.put(2,"K");
		t1.put(3,"S");
		t1.put(4, "D");
		System.out.println(t1.subMap(2, 4));
	}

}
