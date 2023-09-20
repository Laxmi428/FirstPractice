package FileHandling;


import java.io.FileWriter;
import java.io.IOException;

public class File03 {
		public static void main(String[] args) throws IOException {
		
	try {
		FileWriter f=new FileWriter("‪C:\\Users\\HP\\Desktop\\abcdrfgh.txt");
	try {
		f.write("who are you");
	}
	catch(Exception e) {
		
	}
	finally {
		f.close();
	}
	}
	catch(IOException exe) {
	System.out.println(exe);	
	}
		}

}
