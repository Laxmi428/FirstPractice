package numberPrograms;
import java.util.Scanner;

public class PrimeUser_program2 {
public static void main(String[] args) {
	int num, i, count = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter an Integer");
num = sc.nextInt();
for(i = 2; i <= (num / 2); ++i) {
if (num % i == 0) {
count= 1;
 break;
}
}
if (count== 0)
System.out.println(num + " is a Prime Number");
else
System.out.println(num + " is not a Prime Number");
	 
	    }
	}

