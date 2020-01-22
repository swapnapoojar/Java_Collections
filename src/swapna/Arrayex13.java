package swapna;

import java.util.ArrayList;

public class Arrayex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		ArrayList<String> b= new ArrayList<String>();
		a.add("Green");
		a.add("Wheat");
		a.add("Pink");
		b.add("1");
		b.add("3");
		b.add("Pink");
		boolean result =a.equals(b);
		System.out.println(result );
		
		ArrayList<String> c= new ArrayList<String>();
		c.add("Green");
		c.add("Wheat");
		c.add("Pink");
		boolean result2 =a.equals(c);
		System.out.println(result2 );
	}

}
