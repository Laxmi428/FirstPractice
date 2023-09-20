package javaPrograms;
/*
 * write a program to add elements into linked list iterate through the elements using the following technique
.using for loop by help of get()
.using enhance to for loop
.using java.util.iterator
.using java.util.list iterator

*write a program to store elemnts into a stack fetch the elements using peek() and remove the odd numbers and display remaining
*
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator {
	public static void m1(List <Integer> n)
	{
		System.out.println("retriving elements without help of iterator");
		for(int i=0;i<n.size();i++)
		{
			Integer num=n.get(i);
			System.out.println(num);
		}
		System.out.println("retriving elements with help of iterator");	
	}

		public static void m2(List<Integer> l)
		{
			Iterator i=l.iterator();
			while(i.hasNext())
			{
			Integer il=(Integer) i.next();
			System.out.println(il);
			}
		}
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
l.add(9);
l.add(67);
l.add(456);
l.add(34);
	l.add(345);
	m1(l);
	ArrayList<Integer> l1=new ArrayList<Integer>();
	l1.add(9);
	l1.add(67);
	l1.add(456);
	l1.add(34);
	l1.add(345);
	m2(l1);
}
}
