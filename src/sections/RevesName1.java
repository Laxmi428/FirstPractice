package sections;

public class RevesName1 {
public static void main(String[] args) {
	String s="Rama  seetha";
	for(int i=s.length()-1;i>=0;i--)
	{
		if(s.charAt(i)!=' ')
		{
			System.out.print(s.charAt(i));
		}
	}
}
}
