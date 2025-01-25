package maccess;

public class SBuffer2 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(4);
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
		
		sb.append("java");
		System.out.println("sb: "+sb.toString());
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
		
		sb.append("prog");
		System.out.println("sb: "+sb.toString());
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
	}
}
