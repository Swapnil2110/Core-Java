package maccess;

public class SBuffer1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(); //constructor call
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
		
		sb.append("java"); //append value to the object 'sb'
		System.out.println("sb: "+sb.toString());
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
		
		sb.append("program");
		System.out.println("sb: "+sb.toString());
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
		
		sb.insert(4, "language");//insert method
		System.out.println("sb: "+sb.toString());
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
		
		System.out.println("***reverse string***");
		System.out.println(sb.reverse());
	}
}
