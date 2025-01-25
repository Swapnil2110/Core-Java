package maccess5;
import test5.*;
public class DInheritance5 
{
	public static void main(String[] args) 
	{
		System.out.println("===Using Class Name===");
		CClass.a = 14;
		CClass.b = 15;
		CClass.m1();
		CClass.m2();
		System.out.println("===Using Object_Reference===");
		CClass ob = new CClass();
		ob.a = 100;
		ob.b = 200;
		ob.m1();
		ob.m2();
	}
}
