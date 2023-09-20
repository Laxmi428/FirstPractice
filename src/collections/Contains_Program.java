package collections;

import java.util.ArrayList;

public class Contains_Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> a=new ArrayList<Object>();
		a.add("Raj");
		a.add(23);
		a.add(true);
		a.add("java");
		a.add('a');
		System.out.println("Elements stored in a is:"+a);
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add("Raj");
		a1.add(23);
		a1.add(true);
		a1.add("java");
		a1.add('a');
		System.out.println("Elements stored in a is:"+a1);
		boolean result=a.contains(a1);
		System.out.println("After contains():"+result);
	}

}
