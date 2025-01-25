package test;

public class OuterClass 
{
	public static class InnerClass
	{
		
		private int a;
		private int b;
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
