package swapna;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> t1=new TreeMap();
		t1.put(1, "H");
		t1.put(2,"K");
		t1.put(3,"S");
		t1.put(4, "D");
		System.out.println("Keys greater than or equal to 2:"+t1.floorKey(2));
		System.out.println("Keys greater than or equal to 3:"+t1.floorKey(3));
		System.out.println("Keys greater than or equal to 6:"+t1.floorKey(6));
	}

}
