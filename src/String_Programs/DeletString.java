package String_Programs;

public class DeletString {
	public static void main(String[] args) {
String s="laj xyz laja";
String l="";
char ch=s.charAt(0);
for(int i=0;i<s.length();i++)
{
	char ch1=s.charAt(i);
    if(ch1==' ')
{
    	l+=ch1;
	//String s1=s.replace(" ", "/");
	//System.out.println(s1);
	//System.out.println(s1.del);
}
    else
    	System.out.print(ch1);
    
}}
}