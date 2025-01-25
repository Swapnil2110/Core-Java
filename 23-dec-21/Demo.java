class Demo
{
	static int p = 50;
	int q = 60;
	
	void m()//non-static method
	{
		System.out.println("this is m() method");
	}
	
	public static void main(String[] args)//static method
	{
		Demo d = new Demo();//object creation
		
		d.m();
		System.out.println("Value of p: "+p);
		System.out.println("Value of q: "+d.q);
		d.m();//method_call
	}
	
	
	
}