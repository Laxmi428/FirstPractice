package collections;

import java.util.List;
import java.util.ArrayList;

public class Program4 {
public static void main(String[] args) {
	List<Integer> no=new ArrayList<>();
	no.add(10);
	no.add(20);
	no.add(30);
	no.add(40);
	no.add(50);
	no.add(20);
	no.add(null);
	System.out.println(no);
	//no.remove(2);//After remove:[10, 20, 50, 20, null]
	//no.remove((Object)20);
	//boolean result=no.remove((Object)20);//elements removed:true
	int result=no.remove(2);//elements removed:30
	System.out.println("After remove:"+no);
	System.out.println("elements removed:"+result);
	
	
}
}
