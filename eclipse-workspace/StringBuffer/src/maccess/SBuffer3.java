package maccess;

public class SBuffer3 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("nit");
		System.out.println("sb: "+sb.toString());
		System.out.println("lenght: "+sb.length());
		System.out.println("capacity: "+sb.capacity());
		
		sb.append("hyderabad.ameerpet.nareshit");
		System.out.println("sb: "+sb.toString());
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
	}
}
