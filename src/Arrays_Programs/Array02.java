package Arrays_Programs;

import java.util.Arrays;

public class Array02 {
public static void main(String[] args) {
	int s[]= {32,23,34,55,567};
	String str[]= {"kj;la","khuieq","yuoie"};
	System.out.println("original num"+Arrays.toString(s));
	for(int i:s)
	{
	System.out.println("for each"+i);
	}
	Arrays.sort(s);
	System.out.println("after sort"+Arrays.toString(s));
	
	
	
}
}
