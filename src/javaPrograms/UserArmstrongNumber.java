package javaPrograms;

import java.util.Scanner;

public class UserArmstrongNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
//UserArmstrongNumber a=new UserArmstrongNumber();
findArmstrong(num);
	}
	public static void findArmstrong(int num)
	{
		int digit,count=0,sum=0;
		int temp=num,copy=num;
		do
		{
			digit=num%10;
			count++;
			num=num/10;
		}
		while(num!=0);
		do {
			digit=temp/10;
			sum+=(int)Math.pow(digit, count);
			digit=temp/10;
		   }
		while(temp!=0);
			if(sum==copy)
			{
				System.out.println(copy+"is a Armstrong");
			}
			else
			{
				System.out.println(copy+"not a Armstrong");
			}
	}

}
