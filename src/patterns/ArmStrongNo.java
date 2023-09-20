package patterns;

public class ArmStrongNo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=153;
int digit,count=0,Sum=0;
int Originalnum=num;
int Copynum=num;
do
{
	digit=num%10;
count++;
num=num/10;
}
while(num!=0);

do
{
	digit=Copynum%10;
	Sum+=(int)(Math.pow(digit, count));
	Copynum=Copynum/10;
}
while(Copynum!=10);
	if(Sum==Originalnum) {
	System.out.println(Originalnum + "is Armstrongno+");
	}
else
	System.out.println(Originalnum+   "is not a Armstrongno");
	}

}
