package swapna;

import java.util.ArrayList;

public class Arrayex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add("Green");
		a.add("Wheat");
		a.add("Pink");
		a.add("Pink");
		a.add("Pink");
		System.out.println(a+ " ");
		//a.ensureCapacity(5);
		a.trimToSize();
		System.out.println("Trimmed array size"+a);
		

	}

}
