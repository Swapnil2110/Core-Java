class Display
{
	Display()
	{
		System.out.println("***This is constructor***");
	}
	
	void getData()
	{
		System.out.println("***This is getData() method***");
	}
}

class DemoConstructor
{
	public static void main(String [] args)
	{
		System.out.println("***main() method***");
		Display d = new Display();
		d.getData();
	}
}