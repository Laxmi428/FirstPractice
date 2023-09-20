package numberPrograms;

public class StrongNum {
public static void main(String[] args) {
	int num=145,sum=0,factorial=1,copy=num,digit,temp=num;
	while(num>0) {
	digit=num%10;
	for(int i=1;i<=num;i++) {
	factorial*=i;
	}
		sum+=factorial;
		num/=10;
	}
if(sum==copy)
	System.out.println(temp+"is strong num");
else
	System.out.println(temp+"is not strong num");
}
}