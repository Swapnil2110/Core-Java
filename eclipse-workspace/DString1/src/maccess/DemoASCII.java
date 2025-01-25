package maccess;

public class DemoASCII 
{
	public static void main(String[] args)
	{
		System.out.println("***Upper-case letters***");
		for(int i=65; i<=90; i++)
		{
			char ch = (char) i;//type-casting, converting ASCII value into char
			System.out.print(ch+" ");
		}
		System.out.println("\n***Lower-case letters***");
		for(int j=97; j<=122; j++)
		{
			char ch = (char) j;
			System.out.print(ch+" ");
		}
		System.out.println("\n***Numbers***");
		for(int k=48; k<=57; k++)
		{
			char ch = (char) k;
			System.out.print(ch+" ");
		}
	}
}
