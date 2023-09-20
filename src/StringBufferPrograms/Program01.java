package StringBufferPrograms;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="qspiders";
String s2=new String("qspiders");
String s3="qspiders";
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s2));
System.out.println(s2==s3);
	}

}
