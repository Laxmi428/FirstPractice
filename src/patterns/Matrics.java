package patterns;
public class Matrics {
public static void main(String[] args) {
	int z=0;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i==1)
			{
				System.out.print("1");
			}
			else if(i!=1)
			{
				if(i==2)
				{
				if(j==1)
				{
					System.out.print(z);
				}
				else
					System.out.print(1);
				}
				if(i==3)
				{
					if(j==1 || j==2)
					{
					System.out.print(z);
				}
					else
						System.out.print(1);
				}
					if(i==4)
					{
						if(j==1 || j==2 || j==3)
						{
							System.out.print(z);
						}
						else
							System.out.print(1);
					}
					
			}
	}
System.out.println();
}
}
}