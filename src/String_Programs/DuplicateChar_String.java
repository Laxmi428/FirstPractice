package String_Programs;

public class DuplicateChar_String {
public static void main(String[] args) {
	String str="Qspiders";
	for(int i=0;i<str.length();i++)
	{
		int count=0;
		char ch1=str.charAt(i);
		
		for(int j=0;j<str.length();j++)
		{
		 char ch2=str.charAt(j);
		 
		 if((ch1 == ch2)&&(i>j))
		{
			count++;
		    break;
        }
		if(ch1==ch2)
		{
			count++;
		}
		
		}
		System.out.println(ch1+" occured"+count+"times");
  }
	}
}
