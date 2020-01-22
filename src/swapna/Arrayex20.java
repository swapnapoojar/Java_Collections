package swapna;

import java.util.ArrayList;

public class Arrayex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add("Green");
		a.add("Wheat");
		a.add("Pink");
		a.ensureCapacity(1);
		System.out.println(a);
		a.add("Pink");
		a.add("Pink");
		a.add("Pink"); 
		a.add("Pink");
		System.out.println(a);

	}

}
