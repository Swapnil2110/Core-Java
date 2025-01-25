package test;

public class OuterClass 
{
	public class InnerClass
	{
		int a;
		int b;
		public InnerClass(int a, int b)
		{
			this.a=a;
			this.b=b;
		}
		public void getData()
		{
			System.out.println("value of a = "+a);
			System.out.println("value of b = "+b);
		}
	}
}
