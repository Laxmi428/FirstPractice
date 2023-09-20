package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkelist01 {
	public static void m1(List <Integer> n)
	{
		System.out.println("retriving elements with help of for loop");
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
		public static void iter2(List<Integer> l,List<String> n) {
			ListIterator i=l.listIterator();

			System.out.println("retriving elements with help of Listiterator");
			while(i.hasNext())
			{
			Integer il=(Integer) i.next();
			System.out.println(il);
			}

			System.out.println("Listiteration on hashPrevios");
			while(i.hasPrevious())
			{
			Integer il=(Integer) i.previous();
			System.out.println(il);
	}
			System.out.println("iteration done on for each loop");
			for(String f:n) {
				System.out.println(f);
			}
			}
public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList<Integer>();
l.add(9);
l.add(67);
l.add(456);
l.add(34);
	l.add(345);
	m1(l);
	LinkedList<Integer> l1=new LinkedList<Integer>();
	l1.add(9);
	l1.add(67);
	l1.add(456);
	l1.add(34);
	l1.add(345);
	m2(l1);
	LinkedList<Integer> l2=new LinkedList<Integer>();
	l2.add(9);
	l2.add(67);
	l2.add(456);
	l2.add(34);
		l.add(345);
		LinkedList<String> n=new LinkedList<String>();
		n.add("yhny");
		n.add("hbjn");
		n.add("bnm");
		n.add("rfnhyu");

		iter2(l2,n);
}
}
