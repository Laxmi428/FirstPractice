package String_Programs;

import java.util.Scanner;

public class WordString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	String arr[]=str.split(" ");
	for(int i=0;i<arr.length;i++)
	{
	System.out.print(arr[i]);
	System.out.println("words of length is :"+arr.length);
	}
	char []ch=str.toCharArray();
	System.out.println("length of the letters are:"+ch.length);
}
}
/* Result :enter a string
rama seetha lakshmi
ramaseethalakshmiSplit arr of length is :3
*/
