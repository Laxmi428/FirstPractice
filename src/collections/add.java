package collections;



import java.util.ArrayList;
import java.util.List;

public class add {
public static void main(String[] args) {
	List l1=new ArrayList();
	l1.add(23);
	l1.add(256);
	l1.add(45);
	System.out.println(l1);
	List l2=new ArrayList();
	l2.add(56);
	l2.add(67);
	l2.add(568);
	System.out.println(l2);
	l1.addAll(l2);
	
}
	
}

