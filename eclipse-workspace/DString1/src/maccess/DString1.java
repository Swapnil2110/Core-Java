package maccess;

public class DString1 
{
	public static void main(String[] args)
	{
		String s1 = "Java";
		int len1 = s1.length();
		String s2 = "python";
		int len2 = s2.length();
		String s4 = new String("program");
		String s3 = s1.concat(s2);
		int len3 = s3.length();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s3);
	}
}
