package maccess;

public class DemoWrapperClass3 
{
	public static void main(String[] args)
	{
		//boxing process
		Integer ob1 = new Integer(12);
		
		//auto-boxing process
		Integer ob2 = 13;
		
		//unboxing process
		int i = ob1.intValue();
		
		//auto-boxing process
		int j = ob2;
		
		System.out.println(ob1+" "+ob1.getClass());
		System.out.println(ob2+" "+ob2.getClass());
		System.out.println("i: "+i);
		System.out.println("j: "+j);
	}
}
