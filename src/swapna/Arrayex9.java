package swapna;

import java.util.ArrayList;

public class Arrayex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> a= new ArrayList<String>();
		
		a.add("S");
		a.add("D");
		a.add("Q");
		a.add("F");
		System.out.println("before copiying"+a);
		ArrayList<String> b = (ArrayList<String>)a.clone();
		b.add("X");
		b.add("X");
		b.add("X");
		//System.out.println("copied items"+a.clone());
		System.out.println("copied items"+b);

		System.out.println("adding items to copied items"+b);
	}
}
