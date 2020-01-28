package swapna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "H");
		m1.put(2, "E");
		m1.put(3, "L");
		m1.put(4, "L");
		m1.put(5, "O");
		System.out.println(m1);
		System.out.println(" map contains a mapping for the specified key:"+m1.containsKey(4));
		System.out.println(" map contains a mapping for the specified key:"+m1.containsKey(6));
	}

}
