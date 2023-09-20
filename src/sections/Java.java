package sections;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="rama seetha";
String rev="";
int count=0;
int count1=0;
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
	count++;
}
for(int j=0;j<s.length();j++)
{
	if (s.charAt(j)!=' ')
	{
		System.out.print(s.charAt(j));
		count1++;
	}
	
}
System.out.println("\nreverse of string is :"+rev);
System.out.println("Before removing the space count :"+count);
System.out.println("after removing the space:"+count1);
}}
