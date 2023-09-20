package String_Programs;

import java.util.Scanner;

public class LengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String str=sc.nextLine();
System.out.println("by using length():"+str.length());
int count=0;
for(int i=0;i<str.length();i++)
{
char ch[]=str.toCharArray();
count++;
	}
System.out.println("without using length():"+count);

}
}

