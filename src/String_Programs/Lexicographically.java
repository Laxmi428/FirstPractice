package String_Programs;

public class Lexicographically {
public static void main(String[] args) {
	String str="Qspiders";
	System.out.println(str.compareTo("Qspiders"));//result:0
	System.out.println(str.charAt(5));//result:e
	System.out.println(str.contains("p"));//true
	////check wether string is startsWith given character
	System.out.println(str.startsWith("Q"));//true
	//check wether string is endsWith given character
	System.out.println(str.endsWith("S"));//false
	//fetch the portion of string
	System.out.println(str.substring(3));//iders
	System.out.println(str.substring(3,5));//id
	String s="";
	//Remove leading spaces
	System.out.println(s.trim());
	System.out.println();
	
	
}
}
