package String_Programs;

public class String_pattern1 {
public static void main(String[] args) {
	String str="Qspiders";
	for(int i=0;i<=str.length();i++)
	{
		for(int j=0;j<=i;j++)
		{
			char ch=str.charAt(j);
			System.out.print(ch+" ");
		}
		System.out.println();
	}
}
}
