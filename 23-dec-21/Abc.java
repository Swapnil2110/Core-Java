class Abc//main-class
{
	static int x=50;
	public static void main(String[] args)
	{	
		
		System.out.println("value of i: "+x);
		Bbb.j = 54;
		System.out.println("value of j: "+Bbb.j);
	}
}

class Bbb
{
	static int j;
}
