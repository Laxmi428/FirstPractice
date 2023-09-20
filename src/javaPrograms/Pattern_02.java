package javaPrograms;

public class Pattern_02 {
public static void main(String[] args) {
	int row=5,col=1;
	for(int i=1;i<=row;i++)
	{
		for(int j=5;j<=col;j++)
		{
			System.out.println("*");
		}
			if(i<3) {
				col++;
			}
			else {
					col--;
			}
}
	System.out.println();
	}
}
