package pkg2;

public class Parent_1 {
	public void m1()
	{
		System.out.println("parent default method");
		this.m3(10, 11);
	}
	public void m2(int a)
	{
		System.out.println("parent 1 arameterized method");
	}
	public void m3(int a, int b)
	{
		System.out.println("parent 2 arameterized method");
		this.m2(10);
	}
	public void m4(int a, int b, int c)
	{
		System.out.println("parent 3 arameterized method");
		this.m1();
	}
public static void main(String[] args) {
	
}
}
