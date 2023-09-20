package patterns;

public class Patter01 {
public static void main(String[] args) {
	int space=5;
	for(int i=1;i<=space;i--)
	{
		space--;
		for(int j=1; j<=5;j++)
		{
			if(space>0)
			{
				System.out.print(" ");
			}
			else
			System.out.print("*");		
		}
		System.out.println();
	}
	
}
}
