class Test2
{
	//instance block in sub-class
	{
		System.out.println("***sub-class instance block 1***"); //executed every time we create object on class Test2
	}
	//static block in sub-class
	static
	{
		System.out.println("***sub-class static block ***"); //highest priority while creating object, executed once even if there are multiple object creation
	}
}

class DemoBlock2//main class
{
	public static void main(String [] args)
	{
		System.out.println("***main() method before object creation***");
		DemoBlock2 db = new DemoBlock2();
		//System.out.println("***main() method after object creation***");
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2();
		Test2 ob3 = new Test2();
		DemoBlock2 db2 = new DemoBlock2(); 
	}
	//instance block inside main-class
	{
		System.out.println("***main-class instance block 1***"); //executed every time we create object on DemoBlock2, which is a main-class.
	}
	//static block inside main-class
	static
	{
		System.out.println("***main-class static block ***"); //highest priority executed once while class loading
	}
}