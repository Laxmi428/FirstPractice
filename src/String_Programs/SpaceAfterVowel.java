package String_Programs;

import java.util.Scanner;

public class SpaceAfterVowel {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
System.out.println(str.charAt(0));
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)==' ')
	{
		System.out.print(str.charAt(i+1));
	}
}
}
}
/* Result: enter a string
Raji One Of The Student in Qspiders
o/p:ROOTSiQ*/


