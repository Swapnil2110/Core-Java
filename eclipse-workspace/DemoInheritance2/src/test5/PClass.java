package test5;

public class PClass 
{
	public static int a;
	public static void m1()
	{
		System.out.println("===PClass m1()===");
		System.out.println("The value of a: "+a);
	}
	
	//static block
	static
	{
		System.out.println("PClass static block...");
	}
}
