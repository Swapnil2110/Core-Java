package test;
//PArent class A
public class A 
{
	public int a;
	public void m1()
	{
		System.out.println("===Parent class m1()===");
		System.out.println("The value of a: "+a);
	}
	
	//parent class non-static block
	{
		System.out.println("Parent Class Instance Block");
	}
}
