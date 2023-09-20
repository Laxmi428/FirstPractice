package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class TestFile03 {
public static void main(String[] args) throws IOException {
	
try {
		FileWriter f=new FileWriter("C:\\Users\\HP\\Desktop\\abc - Copy.txt");
	try
	{
		f.write("hi how are u");
	}
	/*
	 * catch(Exception e)//we can keep the catch block empty {
	 * //System.out.println(e); }
	 */
	finally
	{
		f.close();
	}
	}
	catch (IOException e1) {
	System.out.println(e1);
	}
	
	
	
	
	
	
	
}
}
