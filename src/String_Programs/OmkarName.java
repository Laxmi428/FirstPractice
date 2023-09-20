package String_Programs;

public class OmkarName {
public static void main(String[] args) {
	String name="omkar";
	String n=" ";
	System.out.println(name.length());
	for(int i=0;i<=name.length()-1;i++)
	{
	if(i==0 || i==4)
	{
		//n+=name.charAt(i);
		System.out.print(name.charAt(i));
	}
	else
	{
		System.out.print("*");
		
	}	
	}	
}
}
