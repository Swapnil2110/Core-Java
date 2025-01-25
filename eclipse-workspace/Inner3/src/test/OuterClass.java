package test;

public class OuterClass 
{
	public void getData()
	{
		  class InnerClass
		  {
			  int a;
			  int b;
			  public InnerClass(int a, int b)
			  {
				  this.a=a;
				  this.b=b;
			  }
			  public void m()
			  {
			  
				  System.out.println("value of a = "+a);
				  System.out.println("value of b = "+b);
			  }
			
		  }
		  InnerClass ob1=new InnerClass(20,30);
		  ob1.m();
		  
		 
	}
}
