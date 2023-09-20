package vectorPrograms;

import java.util.Vector;

public class Vector01 {
public static void main(String[] args) {
	Vector<Integer> v1=new Vector<Integer>();
	v1.add(87);
	v1.add(890);
	v1.add(229);
	System.out.println("elements of integer"+v1);
	v1.set(0,87);
	//v1.insertElementAt(890,1);
	v1.insertElementAt(2,229);
	System.out.println(v1);
	System.out.println(v1);


}
}
