package javaPrograms;
//program to convert PTD int to WCO(perform Boxing)
public class PTVtoWCOPrograms {
public static void main(String[] args) {
int x=12;
//converting int to Integer(WCO)
//Integer iO=new Integer(x);// 1.using constructor
Integer iO=Integer.valueOf(x);//2.using static method
System.out.println("PTD:"+x);
System.out.println("WCO:"+iO);
}
}
