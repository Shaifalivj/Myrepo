package pkg1;

public class Static {
   public void overloading(char a, char b) 
   {
	 char c;
	 c= 'a'/'b';
	  System.out.println("Result of division is " +c);
   }
   public void overloading(int p, int q, int r)
   {
	   int s;
	   s=p*q*r;
	   System.out.println("Multiplication of three number is" +s);
   }
   public static void main(String[] args) 
   {
	Static obj=new Static();
	       obj.overloading('d', '2' );
	       obj.overloading(10, 20, 30);
}
}
