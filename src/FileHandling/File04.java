package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class File04 implements Serializable{
	public void test() throws Throwable
	{
		FileOutputStream f=new FileOutputStream("C:\\Users\\HP\\Desktop\\abc.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		//System.out.println("test executed");
	}
	
	
public static void main(String[] args) throws Throwable {
	File04 t=new File04();
	t.test();
	
	
	
	
	
	
}
}
