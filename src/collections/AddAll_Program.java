package collections;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.SetOfIntegerSyntax;

public class AddAll_Program {
public static void main(String[] args) {
	List<Object> l1=new ArrayList<Object>();
	l1.add(10);
	l1.add(true);
	l1.add('A');
	l1.add(23.98);
	System.out.println("elements stored :"+l1);
	List<Integer> l2=new ArrayList<Integer>();
	l2.add(50);
	l2.add(50);
	l2.add(30);
	System.out.println("elements stored :"+l2);
boolean result=l1.addAll(l2);
System.out.println("After addAll:"+result);
System.out.println("After addAll():"+l1);
	 
}
}
