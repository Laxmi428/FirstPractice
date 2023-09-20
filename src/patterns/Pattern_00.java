package patterns;
import java.util.*;
public class Pattern_00 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("select choi1ce");
	int num=sc.nextInt();
	switch (num) {
	case (1):
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=5;j++)
		{
			if(i==j)
			{
		
		      System.out.print("* ");
	        }
			else
			{
				System.out.print(" ");
			}
		
	     }
		System.out.println();
		}
		break;
	case(2):
	for(int i=1;i<=5;i++)
	{
	for(int j=1;j<=5;j++)
	{
		if(i+j==6)
		{
	
	      System.out.print("* ");
        }
		else
		{
			System.out.print(" ");
		}
		
     }
	System.out.println();
	}
	case(3):
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==j||i+j==6)
			{
				System.out.print("* ");
			}
			else
			
				System.out.print(" ");
			
		}
		System.out.println();
	}
	case(4):
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=j;j++)
			{
				/*if(i==5)
				{
					System.out.println("*");
				}
				else
					System.out.print("");*/
			}
			System.out.println();
			
		}
	break;
default:
		break;
		}	
}}
   
