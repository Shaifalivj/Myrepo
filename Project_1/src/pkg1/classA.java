package pkg1;

public class classA {
public classA()
{
	this(22,23,24);
	System.out.println("Default constructor");
	// TODO Auto-generated constructor stub
}
public classA(int a)
{
	this(22,24,23,54);
    System.out.println("one parameterized");
	// TODO Auto-generated constructor stub
}
public classA(int a, int b)
{
	this();
    System.out.println("two parameterized");
	// TODO Auto-generated constructor stub
}
public classA(int a,int b, int c)
{
    System.out.println("three parameterized");
	// TODO Auto-generated constructor stub
}
public classA(int a,int b, int c, int d)
{
	this(22,43);
    System.out.println("four parameterized");
	// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
	classA obj=new classA(22);
}
	}
	
	

