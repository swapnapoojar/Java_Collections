package swapna;

import java.util.ArrayList;

public class Arrayex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		a.add("Green");
		a.add("Wheat");
		a.add("Pink");
		//System.out.println(a.indexOf(a));
		/*System.out.println(a);*/
//		int size=a.size();
		for(int i=0;i<a.size();i++)
		{
			System.out.println("Elements at position " + i +":"+ a.get(i));
		}
	
		

	}

}
