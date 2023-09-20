package String_Programs;

import java.util.Scanner;

public class EmptyString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	System.out.println(str.isEmpty());
}
}
