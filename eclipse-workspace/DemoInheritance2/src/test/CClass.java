package test;

public class CClass extends PClass 
{
	//constructor
	public CClass()
	{
		//compiler add super() method to call parent class Constructor, while Compiling.
		System.out.println("Child Class Constructor");
	}
}
