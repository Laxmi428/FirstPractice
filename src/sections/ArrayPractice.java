package sections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayPractice {
public static void main(String[] args) {
	
	//Write a program to count the elements present in the ArrayList
	
	
	/* int count=0;
	ArrayList a=new ArrayList();
	a.add("laxmi");
	a.add("ajkf;");
	a.add(24);
	a.add(2.3);
	for(int i=0;i<=a.size();i++)
	{
		count++;	
		System.out.println(count);
	}
	
	System.out.println(a.size());*/
	//write a program to reverse the elements of Linked list by using for loop.
int count=0;
	LinkedList l= new LinkedList();
	l.add("laxmi");
	l.add(23);
	l.add(34.4);
	for(int i=l.size();i>=0;i--)
	{
		System.out.println(l);
		break;
	}
	
}

}
