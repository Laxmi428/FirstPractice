package collections;

import java.util.ArrayList;
//Program to implements all the methods from list.
public class List_Add_Program1 {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<String>();
	names.add("Rama");
	names.add("Radha");
	names.add("Raj");
	names.add("Rama");
	names.add("dady");
	System.out.println("size:"+names.size());
	System.out.println(names);
	names.add(1,"Khrishna");//1.method using add()
	System.out.println("size:"+names.size());
	System.out.println(names);
	names.remove(2);//2. method using remove()
	System.out.println("size:"+names.size());
	System.out.println(names);
	names.set(1, "Khrishna");//3. method set()
	System.out.println("size:"+names.size());
	System.out.println(names);
	System.out.println("Person at index 4:"+names.get(4));//4. method
	names.add("amma");
	System.out.println(names);
	System.out.println("First position of Rama:"+names.indexOf("Rama"));//5. method
	System.out.println("Last position of Rama"+names.lastIndexOf("Rama"));//6. method
	ArrayList<String> soul=new ArrayList<String>();
	soul.add("heven");
	soul.add("Beauty");
	soul.add("litlePrince");
	names.addAll(soul);     //7. method
	System.out.println(names);
	
}
}
