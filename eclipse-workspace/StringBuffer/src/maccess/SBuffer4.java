package maccess;

public class SBuffer4 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer(sb1);
		System.out.println(sb2.toString());
		
		System.out.println("sb2: "+sb2.toString());
		System.out.println("Length: "+sb2.length());
		System.out.println("Capacity: "+sb2.capacity());
		
		sb2.append("language");
		System.out.println("sb2: "+sb2.toString());
		System.out.println("Length: "+sb2.length());
		System.out.println("Capacity: "+sb2.capacity());
		
		System.out.println("sb1: "+sb1.toString());
		System.out.println("Length: "+sb1.length());
		System.out.println("Capacity: "+sb1.capacity());
		
		sb1.append("program");
		System.out.println("sb1: "+sb1.toString());
		System.out.println("Length: "+sb1.length());
		System.out.println("Capacity: "+sb1.capacity());
		
		sb2.append("THREAD");
		System.out.println("sb2: "+sb2.toString());
		System.out.println("Length: "+sb2.length());
		System.out.println("Capacity: "+sb2.capacity());
		
	}
}
