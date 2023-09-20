package FileHandling;
//program to wether file is exists or not  display the size of the contentand display the path the of the file
import java.io.File;

public class TestFile01 {
public static void main(String[] args) {
	File f=new File("Desktop\\abc - Copy.txt");
	System.out.println(f.exists());
	System.out.println(f.canWrite());
	System.out.println(f.canRead());
	System.out.println(f.length());
	System.out.println(f.getAbsolutePath());
	//f.delete();
}
}
