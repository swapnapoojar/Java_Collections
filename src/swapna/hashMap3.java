package swapna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "H");
		m1.put(2, "E");
		m1.put(3, "L");
		m1.put(4, "L");
		m1.put(5, "O");
		System.out.println("m1 map="+m1);
		HashMap<Integer,String> m2=new HashMap();
		 m2.putAll(m1);
		 System.out.println("m2 map="+m2);
		
		
	}

}
