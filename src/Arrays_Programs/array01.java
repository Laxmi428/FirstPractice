package Arrays_Programs;

import java.util.Arrays;
import java.util.HashMap;

public class array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s[]= {32,23,34,55,567};
System.out.println("elements befor sorting");
for(int i=0;i<=s.length-1;i++)
{
	System.out.println(s[i]);
}
System.out.println();
System.out.println("after sorting");
for(int i:s)
{
Arrays.sort(s);
System.out.println(i);
	}


}

}
