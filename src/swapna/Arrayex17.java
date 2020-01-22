package swapna;

import java.util.ArrayList;

public class Arrayex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();	
		a.add("S");
		a.add("D");
		a.add("Q");
		a.add("F");
		System.out.println(a);
		a.removeAll(a);
		System.out.println("removed items"+a);

	}

}
