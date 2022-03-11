package pkg2;

public class Child_1 extends Parent_1{
	public void m5()
	{
		super.m4(10,111,12);
		System.out.println("child default method");
		this.m7(54, 76);

	}
	public void m6(int a)
	{
		this.m8(34, 56, 89);
		System.out.println("child 1 parameterized method");
		
	}
	public void m7(int a, int b)
	{
		this.m6(22);
		System.out.println("child 2 parameterized method");
		
	}
	public void m8(int a, int b, int c)
	{
		System.out.println("child 3 parameterized method");
		
	}
	public static void main(String[] args) {
		Child_1 obj=new Child_1();
		obj.m5();
		
		
	}
	
}
