package test;

public class Addition implements IArithmetic 
{
	public void calculate(int x, int y)
	{
		System.out.println("Addition of "+x+" + "+y+" = "+(x+y));
	}
}
