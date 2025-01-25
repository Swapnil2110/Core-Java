package maccess;
import test.*;
public class MainClass 
{
	public static void main(String[] args)
	{
		//OuterClass ob1 = new OuterClass();
		OuterClass.InnerClass ob3 = new OuterClass.InnerClass(23,45);
		ob3.getData();
	}
}
