class Display
{
	static
	{
		System.out.println("**Static block**");
	}
	Display()
	{
		System.out.println("**Display Constructor**");
	}
	{
		System.out.println("Instace block");
	}
}


class DemoConstructor2
{
	public static void main(String [] args)
	{
		Display d = new Display();
	}
}