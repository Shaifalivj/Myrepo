package pkg1;

public class Student //creating class
{                   //{}boundary or body of the class
int a;             //integer type variable a is the name of variable

public void abc() //()indicates the method abc is the name of method
{
	System.out.println("Welcome all of you");  //user defined method
}
public static void main(String[] args) //main method creation it predefined method 
{                                   //main method is given by java
	Student deepak= new Student();  //object creation to call/access the class
	deepak.abc();                   //calling method 
	deepak.a=234;                   //calling variable
	System.out.println(deepak.a);   //printing output
	deepak.a=578;
	System.out.println(deepak.a);
	
}
}





