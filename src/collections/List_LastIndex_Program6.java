package collections;

import java.util.ArrayList;

public class List_LastIndex_Program6 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rama");
		names.add("Radha");
		names.add("Raj");
		names.add("Rama");
		names.add("dady");
	int res1=names.lastIndexOf("Rama");
	System.out.println(res1);
	System.out.println(names);
	}
}
