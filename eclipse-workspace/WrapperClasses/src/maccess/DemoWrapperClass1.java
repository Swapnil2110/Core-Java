package maccess;

public class DemoWrapperClass1 
{
	public static void main(String[] args) 
	{
		//boxing process, assigning object variable with primitive data-type values
		byte b = 11;
		Byte ob1 = new Byte(b);
		Byte ob2 = new Byte("111");
		short s = 12;
		Short ob3 = new Short(s);
		Short ob4 = new Short("112");
		Integer ob5 = new Integer(13);
		Integer ob6 = new Integer("113");
		Long ob7 = new Long(14555555555555l);
		Long ob8 = new Long("114");
		Float ob9 = new Float(15.011f);
		Float ob10 = new Float(15.0222);
		Float ob11 = new Float("15.0333");
		Double ob12 = new Double(16.2555555555555);
		Double ob13 = new Double("16.88888888888888888");
		Character ob14 = new Character('A');
		Boolean ob15 = new Boolean(false);
		Boolean ob16 = new Boolean("true");
		
		System.out.println("ob1: "+ob1.toString()+" "+ob1.getClass()/*.getSimpleName()*/);
		System.out.println("ob2: "+ob2.toString()+" "+ob2.getClass().getSimpleName());
		System.out.println("ob3: "+ob3.toString());
		System.out.println("ob4: "+ob4.toString());
		System.out.println("ob5: "+ob5.toString());
		System.out.println("ob6: "+ob6.toString());
		System.out.println("ob7: "+ob7.toString()+" "+ob7.getClass());
		System.out.println("ob8: "+ob8.toString()+" "+ob8.getClass());
		System.out.println("ob9: "+ob9.toString()+" "+ob9.getClass());
		System.out.println("ob10: "+ob10.toString()+" "+ob10.getClass());
		System.out.println("ob11: "+ob11.toString()+" "+ob11.getClass());
		System.out.println("ob12: "+ob12.toString()+" "+ob12.getClass());
		System.out.println("ob13: "+ob13.toString()+" "+ob13.getClass());
		System.out.println("ob14: "+ob14.toString()+" "+ob14.getClass());
		System.out.println("ob15: "+ob15.toString()+" "+ob15.getClass());
		System.out.println("ob16: "+ob16.toString()+" "+ob16.getClass());
		
	}
}
