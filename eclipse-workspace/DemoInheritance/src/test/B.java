package test;
//child  class B
public class B extends A
{
	public int b;
	public void m2()
	{
		System.out.println("===Child Class m2()===");
		System.out.println("The value of b: "+b);
	}
	
	//Child class non-static Block
	{
		System.out.println("Child class Instance Block");
	}
}
