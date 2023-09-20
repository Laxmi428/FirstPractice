
package javaPrograms;
import java.util.Scanner;
public class Q {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter an int value");
		num=sc.nextInt();
		//converting into string object;
		String s1=Integer.toString(num);
		System.out.println("Ptd: "+num);
	}
}




	
	

/*float num1;
System.out.println("enter a float type value: ");
num1=sc.nextFloat();
String s2=Float.toString(num1);
System.out.println("PTD: "+num1);
System.out.println("So: "+s2);

double num2;
System.out.println("enter a double type value: ");
num2=sc.nextDouble();
String s3=Double.toString(num2);
System.out.println("PTD: "+num2);
System.out.println("So: "+s2);


long num3;
System.out.println("enter a long type value: ");
num3=sc.nextLong();
String s4=Long.toString(num3);
System.out.println("PTD: "+num3);
System.out.println("So: "+s3);

/*pt store ptv as string and convert into corresponding ptd;*/






