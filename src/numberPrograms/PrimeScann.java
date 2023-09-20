package numberPrograms;
import java.util.*;
public class PrimeScann {
	public static void main(String[] args) {Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
	int num=sc.nextInt();
	System.out.println("enter count as '0' number");
int count=sc.nextInt();
for(int i=2;i<=num;i++)
{
	for(int j=2;j<=i/2;j++)
	{
		if(i%j==0)
			count++;
			break;
		}
		if(count==0)
			System.out.println(num+"is a prime");
	}
	}}
