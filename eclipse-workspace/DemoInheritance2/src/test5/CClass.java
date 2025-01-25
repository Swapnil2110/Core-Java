package test5;

public class CClass extends PClass
{
	public static int b;
	public static void m2()
	{
		System.out.println("===CClass m2()===");
		System.out.println("The value of b: "+b);
	}
	//static block
	static
	{
		System.out.println("CClass static block...");
	}
}
