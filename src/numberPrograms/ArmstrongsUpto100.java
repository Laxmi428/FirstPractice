package numberPrograms;

public class ArmstrongsUpto100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=200,sum=0,digit;
		int i=0;
		int copy=i,temp=i,count=0;
		for(;i<=num;i++)
		{
		
		do
		{
			digit =i%10;
			count++;
			i/=10;
		}
		while(i!=0);
		do
		{
			digit =temp%10;
			sum+=(int)Math.pow(digit, count);
			temp/=10;
		}
		while(temp!=0);
		}
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
