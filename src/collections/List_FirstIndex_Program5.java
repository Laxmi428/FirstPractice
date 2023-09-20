package collections;

import java.util.ArrayList;

public class List_FirstIndex_Program5 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rama");
		names.add("Radha");
		names.add("Raj");
		names.add("Rama");
		names.add("dady");
		System.out.println("size:"+names.size());
		int res=names.indexOf("Rama");
		System.out.println(res);
		System.out.println(names);
}
}
