package FileHandling;
import java.io.File;
import java.io.IOException;
public class File01 {
	public static void main(String[] args)throws IOException {
		File f=new File("C:\\Users\\HP\\Desktop\\abc.txt");
		System.out.println(f.exists());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.length());
		System.out.println(f.getAbsolutePath());
		//System.out.println(f.renameTo(f));
		
	}

	
	}


