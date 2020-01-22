package swapna;

import java.util.LinkedList;

public class Linkdlistex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1= new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(2);
		l1.add(5);
		System.out.println("elements"+l1);
		for(int i=l1.size()-1;i>=0;i--)
		{
			System.out.println(l1.get(i));
		}
	}

}
