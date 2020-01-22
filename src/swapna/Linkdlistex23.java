package swapna;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkdlistex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1= new LinkedList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println("elements"+l1);
		List<Integer> l2= new ArrayList<Integer>(l1);
		for(int x: l2)
		{
			System.out.println(x+" ");
		}
		
	}

}
