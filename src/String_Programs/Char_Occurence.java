package String_Programs;
//WAP TO GET A JOB WITH 3.5 LPA
import java.util.Scanner;

public class Char_Occurence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	
	for(int i=0;i<str.length();i++)
	{
		
		char ch1=str.charAt(i);
		int count=0;
		for(int j=0;j<str.length();j++)
		{
			char ch2=str.charAt(j);
		if((ch1 == ch2)&&(i>j))
		{
		break;
	     }
		
		if(ch1==ch2)
		{
			count++;
		}
	
		}
		if(count>0)
		{
		System.out.println(ch1+"present"+count+"times");
        }
      }
}
}
