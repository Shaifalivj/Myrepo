package pkg1;

public class datatypecon {
	public void implicit(int a)
	{
		char b;
		b=(char)a;
		System.out.println("value of b=" +b); //explicit conversion
	}
	public void implicit(char x)
	{
		int y;
		y=x;
		System.out.println("value of y=" +y);   //implicit conversion
	}
	public void implicit (float p)
	{
		int q;
		q= (int)p;
		System.out.println("value of q=" +q);
		
	}
	public static void main(String[] args) {
		datatypecon obj=new datatypecon();
		            obj.implicit(100);
		            obj.implicit('d');
		            obj.implicit(12.4F);
		
		
		
		
		
	}

}
