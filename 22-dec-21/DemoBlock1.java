class Test1
{
	static
	{
		System.out.println("***Sub-class static Block 1***");
	}
}

class DemoBlock1 //main class
{
	public static void main(String [] args)
	{
		System.out.println("***main() method***");
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
	}
	static
	{
		System.out.println("***Main Class static Block 1***");
	}
	static
	{
		System.out.println("***Main Class Static Block 2***");
	}
}