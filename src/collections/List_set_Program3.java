package collections;

import java.util.ArrayList;

public class List_set_Program3 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Rama");
		names.add("Radha");
		names.add("Raj");
		names.add("Rama");
		names.add("dady");
		System.out.println("Before the set():"+names);
		System.out.println("size is:"+names.size());
		names.set(2, "Khrishna");
		System.out.println("After the set():"+names);
	System.out.println("size is:"+names.size());
}
}
