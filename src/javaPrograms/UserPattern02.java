package javaPrograms;

import java.util.Scanner;

public class UserPattern02 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a choice");
	int choice=sc.nextInt();
	switch (choice) {
	case 1:
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		break;
	case 2:
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println();
		}

	default:
		System.out.println("kindly enter 1 and 2");
		break;
	}
}
}
