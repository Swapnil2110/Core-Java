class DemoVariables
{
	static int a = 10;
	int b = 20;
	
	public static void main(String args[])					//static method
	{
		DemoVariables ob = new DemoVariables();
		int c = 30;
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+ob.b);
		System.out.println("The value of c="+c);
		ob.m();
	}
	void m()									//non-static method
	{
		System.out.println("===m()===");
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);//variable "b" can be directly accessible in "m()" because b is a "non-static" variable
	}
}