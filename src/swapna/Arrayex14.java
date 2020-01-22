package swapna;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add("Green");
		a.add("Wheat");
		a.add("Pink");
		System.out.println(a+ " ");
		Collections.swap(a, 0,2);
		System.out.println("swapped items:"+a);
	}

}
