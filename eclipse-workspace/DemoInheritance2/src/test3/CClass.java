package test3;

public class CClass extends PClass
{
	//constructor
	CClass(int a, int b, int c)
	{
		super(a,b);
		System.out.println("The value of c: "+c);
	}
	//constructor
	public CClass(int a, int b, int c, int d)
	{
		this(a,b,c);
		System.out.println("The value of d: "+d);
	}
}
