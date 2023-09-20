package javaPrograms;

public class Distinct_Chars {
public static void main(String[] args) {
	String s="lakslahmi";
	int count=0;
	String str1=" ";
	String str2=" ";
	int i,j;
	for(i=0;i<=s.length()-1;i++)
	{
		for(j=i;j<=s.length()-1;j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				str1+=s.charAt(j);
			}
		
			else {
				count++;
				str2+=s.charAt(i);
				break;
			}
		}
		}
	System.out.println(str1);
	System.out.println(str2);
	
}
}
