package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteraror01 {
	public static void iter2(List<Integer> l,List<String> n) {
		ListIterator i=l.listIterator();

		System.out.println("iteration going on HashNext()");
		while(i.hasNext())
		{
		Integer il=(Integer) i.next();
		System.out.println(il);
		}

		System.out.println("iteration on hashPrevios");
		while(i.hasPrevious())
		{
		Integer il=(Integer) i.previous();
		System.out.println(il);
}

		System.out.println("iteration done");
	for(String f:n) {
		System.out.println(f);
	}
	}
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(9);
		l.add(67);
		l.add(456);
		l.add(34);
			l.add(345);
			ArrayList<String> n=new ArrayList<String>();
			n.add("yhny");
			n.add("hbjn");
			n.add("bnm");
			n.add("rfnhyu");

			iter2(l,n);
	}
	}
