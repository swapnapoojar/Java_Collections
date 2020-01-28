package swapna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "H");
		m1.put(2, "E");
		m1.put(3, "L");
		m1.put(4, "L");
		m1.put(5, "O");
		System.out.println(m1);
		//Iterator<String> it=  m1.iterator();
		/*Iterator <String> it= m1.iterator();
		while(it.hasNext())
		{
			//System.out.println("key"+m1.get(2)+"value"+m1.get("E"));
			System.out.println();
		}
		//System.out.println("key"+m1.get(2)+"value"+m1.get("E"));*/
		/*
		 * for (Entry<Integer, String> s: m1.entrySet()) {
		 * System.out.println(s.getKey()+" "+s.getValue()); }
		 */
		String s= m1.get(2);
		
		System.out.println("getting value of key 2:"+s);
	}

}
