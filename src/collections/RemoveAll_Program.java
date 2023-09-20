package collections;

import java.util.ArrayList;

public class RemoveAll_Program {
public static void main(String[] args) {
	//ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Object> a=new ArrayList<Object>();
	a.add("Raj");
	a.add(23);
	a.add(true);
	a.add("java");
	a.add('a');
	System.out.println("Elements stored in a is:"+a);
	a.remove(true);//1
	System.out.println("After remove a is:"+a);
	ArrayList<Object> a1=new ArrayList<Object>();
	a1.add(12);
	a1.add(23);
	a1.add(33);
	a1.add(89);
	a1.add(256);
	System.out.println("Elements stored in a1 is:"+a1);
	a.addAll(a1);
	System.out.println("After addAll():"+a);
	a.clear();//3
	System.out.println("After clear() a is:"+a);
	a.removeAll(a1);//2
	System.out.println("After removeAll():"+a1);
	
	
}
}
