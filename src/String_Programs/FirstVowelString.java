package String_Programs;

import java.util.Scanner;

public class FirstVowelString {

	public static void main(String[] args, String index) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String s=" ";
		  for(int i=0; i<str.length(); i++) {
		      if(str.contains("aeiouAEIOU"))
		      {
		  s+=str.charAt(i);
		  break;
		      }
		  System.out.println(s);
		     
		  }
		  }
		
}


