package collections;

import java.util.ArrayList;

public class List_Remove_Program4 {
	public static void main(String[] args) {
	ArrayList names=new ArrayList();
	names.add("Rama");
	names.add("Radha");
	names.add("Raj");
	names.add(678);
	names.add("Rama");
	names.add("dady");
	//System.out.println("size:"+names.size());
	//names.remove(3);
	//System.out.println("size:"+names.size());
	int index=(int) names.remove(3);
	System.out.println(index);
}
}
