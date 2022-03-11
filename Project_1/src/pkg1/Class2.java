package pkg1;

public class Class2 {
	public void method1()
	{
		System.out.println("defualt method");
		this.method4(22,34,36);
	}
	public void method2(int a)
	{
		System.out.println("one parameterized method");
		this.method1();
	}
	public void method3(int a,int b)
	{
		System.out.println("two parameterized method");
		
		
	}
	public void method4(int a,int b, int c)
	{
		System.out.println("three parameterized method");
		this.method3(45,67);
	}
	public static void main(String[] args) {
		Class2 obj=new Class2();
		obj.method2(45);
	}

}
