package test3;

public class ImpClass implements DTest
{
	public void add(int x, int y)
	{
		System.out.println("Addition = "+(x+y));
	}
	public void mul(int x, int y)
	{
		System.out.println("Multiplication = "+(x*y));
	}
	public void dis(int k)
	{
		System.out.println("The value of k = "+k);
	}
	//parameterized constructor for ImpClass
	public ImpClass(int z)
	{
		System.out.println("===Constructor of ImpClass===");
		System.out.println("The value of z = "+z);
	}
	//instance block
	{
		System.out.println("===Instance block===");
	}
}
