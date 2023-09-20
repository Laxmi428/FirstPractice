package String_Programs;

import java.util.Scanner;

public class CountVowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	 String str=sc.nextLine();
	 int aCount=0,eCount=0,iCount=0,oCount=0,uCount=0;
	    for(int i=0; i<str.length(); i++) {
			/*
			 * if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' ||
			 * str.charAt(i) == 'o' || str.charAt(i) == 'u')
			 * 
			 * System.out.println("Given string contains " + str.charAt(i)+" at the index "
			 * + i);
			 */
	    	
	    	char ch=str.charAt(i);
	    	if(ch=='a')
	    		aCount++;
	    	if(ch=='e')
	    		eCount++;
	    	if(ch=='i')
	    		iCount++;
	    	if(ch=='o')
	    		oCount++;
	    	if(ch=='u')
	    		uCount++;
	    }
	    	System.out.println("occurence of a is"+aCount);
	    	System.out.println("occurence of e is"+eCount);
	    	System.out.println("occurence of i is"+iCount);
	    	System.out.println("occurence of o is"+oCount);
	    	System.out.println("occurence of u is"+uCount);
	    	
	    }
	  }


