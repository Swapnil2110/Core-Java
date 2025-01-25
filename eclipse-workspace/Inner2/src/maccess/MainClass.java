package maccess;

import test.OuterClass;

public class MainClass 
{
	public static void main(String[] args) 
	{
		OuterClass ob1 = new OuterClass();
		OuterClass.InnerClass ob3 = ob1.new InnerClass(40,50);
		ob3.getData();
	}
}
