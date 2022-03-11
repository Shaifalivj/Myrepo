package pkg2;

public class Child extends Parent{
	public Child() 
	{
		super(24);
	System.out.println("child default constructor");	// TODO Auto-generated constructor stub
	}
	public Child(int a) 
	{
		this(34,56,78);
	System.out.println("child 1 parameterized constructor");	// TODO Auto-generated constructor stub
	}
	public Child(int a, int b) 
	{
	this(22);
	System.out.println("child 2 parameterized constructor");	// TODO Auto-generated constructor stub
	}
	public Child(int a, int b, int c) 
	{
		this();
	System.out.println("child 3 parameterized constructor");	// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Child obj1=new Child(22,34);
		
	}

}
