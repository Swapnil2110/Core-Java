package test2;

public class Addition implements IArithmetic
{
	public void calculate(int x, int y)
	{
		System.out.println("Sum = "+(x+y));
	}
}
