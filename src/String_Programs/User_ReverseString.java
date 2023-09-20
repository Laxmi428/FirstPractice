package String_Programs;

import java.util.Scanner;

public class User_ReverseString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.nextLine();
	String str="";
for(int i=s.length()-1;i>=0;i--)
{
	char ch=s.charAt(i);
	str+=ch;
}
System.out.println(str);
}
}
