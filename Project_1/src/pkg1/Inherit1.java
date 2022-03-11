package pkg1;

public class Inherit1 extends Inherit {
	public void color() 
	{
		System.out.println("Blue colored pen");
	}
	public static void main(String[] args) 
	{
		Inherit1 obj2=new Inherit1();
		obj2.pen();
		obj2.price();
		obj2.color();
	}

}
