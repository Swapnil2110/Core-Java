package maccess;

public class DemoWrapperClass2 
{
	public static void main(String[] args)
	{
		//Auto boxing, assigning objects with primitive data-type values automatically without calling constructor
		byte b = 11;
		Byte ob1 = 12;
		Byte ob2 = b;
		Short ob3 = 15;
		Integer ob4 = 16;
		Long ob5 = 17L;
		Float ob6 = 18.111F;
		Double ob7 = 19.22;
		Character ob8 = 'A';
		Boolean ob9 = true;
		
		System.out.println("ob1: "+ob1.toString()+" "+ob1.getClass());
		System.out.println("ob2: "+ob2.toString()+" "+ob2.getClass());
		System.out.println("ob3: "+ob3.toString()+" "+ob3.getClass());
		System.out.println("ob4: "+ob4.toString()+" "+ob4.getClass());
		System.out.println("ob5: "+ob5.toString()+" "+ob5.getClass());
		System.out.println("ob6: "+ob6.toString()+" "+ob6.getClass());
		System.out.println("ob7: "+ob7.toString()+" "+ob7.getClass());
		System.out.println("ob8: "+ob8.toString()+" "+ob8.getClass());
		System.out.println("ob9: "+ob9.toString()+" "+ob9.getClass());
	}
}
