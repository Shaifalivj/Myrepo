package pkg1;

public class Subtraction extends Addition {
	public void sum (int x, int y) 
	{
		int z;
		z= x-y;
		System.out.println("Subtraction of two number is " + z);
	}
	public static void main(String[] args)
	{
		Subtraction obj=new Subtraction();
		obj.sum(15, 10);
	}

}
