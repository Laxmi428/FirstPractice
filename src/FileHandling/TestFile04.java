package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFile04 {
public static void main(String[] args) throws Throwable {
	FileReader r=new FileReader("C:\\Users\\HP\\Desktop\\abc - Copy.txt");
	int i;
	while((i=r.read())!=-1)
	{
		System.out.print(i+": "+(char)i);
		System.out.println();
	}
	}
}
