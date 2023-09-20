package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_01 {
public static void main(String[] args) {
	Set<String> course=new HashSet<String>();
	 String req="Y";
	 Scanner sc=new Scanner(System.in);
	 while (req.equalsIgnoreCase(req)==true) {
	System.out.println("enter the course name");
		String cname=sc.next();
		course.add(cname);
		System.out.println("do you want to continuee[]Y/N");
		req=sc.next();
		if(req.equalsIgnoreCase("N"))
		{
			break;
		}
		
	}
	System.out.println(course);
	
	
	
}
}
