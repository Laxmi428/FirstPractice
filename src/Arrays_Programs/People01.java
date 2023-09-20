package Arrays_Programs;

import java.util.Arrays;

public class People01 {
	public static boolean m1(int arr[])
	{
	int sum=0;
	Arrays.sort(arr);
	int largenum=arr[arr.length-1];
	System.out.println("maximum number is"+largenum);
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.println(arr[i]);
	
	
	if(arr[i]==largenum)
	{
		continue;
	}
	else
	{
		 sum=sum+arr[i];
	}
	if(sum==largenum)
	{
		return true;
	}
}
	return false;
}
public static void main(String[] args) {
	int[] arr= {10,4,5,11};
	boolean method=m1(arr);
	System.out.println(method);
}
}