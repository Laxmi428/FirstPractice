package collections;

import java.util.ArrayList;
import java.util.List;

public class ClearProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add(23);
		l1.add(256);
		l1.add(45);
		
		/*
		 * System.out.println("Before clear the collection:"+l1); l1.clear();
		 * System.out.println("After clear the collection:"+l1);
		 */
		System.out.println(l1);
		List l2=new ArrayList();
		l2.add(56);
		l2.add(67);
		l2.add(568);
		System.out.println(l2);
		l1.addAll(l2);
		if(l1.containsAll(l2))
		{
			System.out.println("element is available in the given collection");
		}
		else
		{
			System.out.println("element is not available");
		}
	}

}
