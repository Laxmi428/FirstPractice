package vectorPrograms;

import java.util.Vector;

public class VectorAddMethods {
public static void main(String[] args) {
	Vector<Object> v=new Vector<Object>();
	v.add("java");
	v.add(64873);
	v.add(3.87);
	System.out.println("elements on default vector"+v);
	Vector<Integer> v1=new Vector<Integer>();
	v1.add(87);
	v1.add(890);
	v1.add(229);
	System.out.println("elements of integer"+v1);
	}
}
