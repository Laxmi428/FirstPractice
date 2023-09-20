package javaPrograms;

public class PTD_SCO {
public static void main(String[] args) {
	int x=345;
	Integer iO=Integer.valueOf(x);
	String s1=iO.toString();
	System.out.println("SCO  "+s1);
	System.out.println("PTV  "+x);
	
	
	int y=8475;
	Integer iO1=Integer.valueOf(y);
	String s2=iO1.toString();
	
	System.out.println("SCO  "+s2);
	System.out.println("PTV  "+y);
	
	
	String sum;
	int sum1;
	sum=s1+s2;
	sum1=x+y;
	System.out.println(sum);
	System.out.println(sum1);
	
}
}
