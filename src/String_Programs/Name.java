package String_Programs;

public class Name {
	public static void main(String[] args) {
	 String str="Veereshamma";
	 String rev=" ";
	for(int i=str.length()-1;i>=0;i--){
		rev=rev+str.charAt(i);	
	}
	System.out.println(rev);
	System.out.println(str.length());
	}
}