package sections;

public class JavaFindCommonElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str []= {"lavaa jdh","jkhasl","wtyuyi","qerreq"};
	for(int i=0;i<=str.length;i++)
	{
		for(int j=i+1;j<=str.length;j++)
		{
			if(str[i]==str[j])
			{
				System.out.println(str[i]);
			}
		}
	}
for(String a:str)
{
	System.out.println(a);
}
	}

}
