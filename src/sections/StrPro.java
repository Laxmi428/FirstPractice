package sections;

public class StrPro {
String l;
String al;
StrPro(String l,String al)
{
this.l=l;
this.al=al;
}
@Override
public String toString()
{
	return "name"+l+"\n name"+al;
}
	public static void main(String[] args) {
		StrPro s=new StrPro("laxmi","jksafd");
System.out.println(s);
	}

}
