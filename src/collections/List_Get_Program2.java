package collections;

import java.util.ArrayList;

public class List_Get_Program2 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rama");
		names.add("Radha");
		names.add("Raj");
		names.add("Rama");
		names.add("dady");
		String res=names.get(3);
		System.out.println(names);
		System.out.println("the given name is:"+res);
}
}
