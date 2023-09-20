package javaPrograms;

import java.util.Iterator;
import java.util.Stack;

import javax.swing.Popup;

public class StackPrograms {
public static void main(String[] args) {
	Stack s=new Stack();
	s.add(32);
	s.add(56);
	s.add(778);
	s.add(16);
	while(s.isEmpty()==false)
	{
		int x=(int) s.peek();
		if(x%2==1)
		{		
			System.out.println(s);
		}
		
	}
	System.out.println(s.pop());
Stack s1= (Stack) s.pop();	
System.out.println(s1);
}
}
