package FileHandling;

import java.io.File;

public class TestFile02 {
public static void main(String[] args) {
	File f=new File("C:\\Users\\HP\\Desktop\\abc - Copy.txt");
	File r=new File("C:\\Users\\HP\\Desktop\\abc - Qspiders.txt");
	if(f.exists())
	{
		int size=(int)f.length();
		System.out.println("Size of file content:"+size);
		String absPath=f.getAbsolutePath();
		System.out.println("File path:"+absPath);
		f.renameTo(r);
	}
	else
	{
		System.err.println("File! not Found");
	}
}
}
