package test3;

public class PClass 
{
	//constructor
	PClass(int a)
	{
		System.out.println("The value of a: "+a);
	}
	//constructor
	PClass(int a,int b)
	{
		this(a);
		System.out.println("The value of b: "+b);
	}
}
