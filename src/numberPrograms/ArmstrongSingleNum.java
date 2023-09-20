package numberPrograms;

public class ArmstrongSingleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,sum=0,digit;
		int copy=num,temp=num,count=0;
		do
		{
			digit =num%10;
			count++;
			num/=10;
		}
		while(num!=0);
		do
		{
			digit =temp%10;
			sum+=(int)Math.pow(digit, count);
			temp/=10;
		}
		while(temp!=0);
		if(copy==sum)
		{
			System.out.println(copy+"is an armstrong");
		}
		else
		{
			System.out.println(copy+"is not an armstrong");
		}

	}

}
