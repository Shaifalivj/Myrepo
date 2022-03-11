package pkg2;

public class Parent {
	
	public Parent() 
	{
		this(23,34,45);
		System.out.println("parent default constructor");
		// TODO Auto-generated constructor stub
	}
	public Parent(int a) 
	{
		this(78,65);
		System.out.println("parent 1 parameterized constructor");
		// TODO Auto-generated constructor stub
	}
	public Parent(int a, int b) 
	{
		this();
		System.out.println("parent 2 parameterized constructor");
		// TODO Auto-generated constructor stub
	}
	public Parent(int a, int b, int c) 
	{
		System.out.println("parent 3 parameterized constructor");
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Parent obj=new Parent();
	
}
}
