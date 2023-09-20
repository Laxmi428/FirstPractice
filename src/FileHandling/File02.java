package FileHandling;

import java.io.File;

public class File02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\HP\\Desktop\\abc.txt");
File f1=new File("Desktop\\qspiders.txt");
	if(f.exists()) {
	int size=(int)f.length();
	System.out.println("size of matter " +size);
	String abspath=f.getAbsolutePath();
	System.out.println("path of the file: "+abspath);
	f.renameTo(f1);
	// f.delete();
	}
	else
	{
	System.out.println("Error! file not found.");
	}
	}

}
