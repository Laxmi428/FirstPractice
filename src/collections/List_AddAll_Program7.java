package collections;

import java.util.ArrayList;

public class List_AddAll_Program7 {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<String>();
	names.add("Rama");
	names.add("Radha");
	names.add("Raj");
	names.add("Rama");
	names.add("dady");
	System.out.println("size:"+names.size());
    System.out.println(names);
	ArrayList<String> soul=new ArrayList<String>();
	soul.add("heven");
	soul.add("Beauty");
	soul.add("litlePrince");
	names.addAll(soul); 
	System.out.println("After addAll() size is:"+names.size());
	System.out.println(names);
}
}
