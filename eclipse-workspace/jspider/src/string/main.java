package string;

public class main 
{

	public static void main(String[] args)
	{
		String s1 = "java";
		int len1 = s1.length();
		String s2 = "programming";
		String s3 = s1.concat(s2);
		int len2 = s3.length();
		String s4 = new String("langauge");
		String s5 = s3.concat(s4);
		int len3 = s5.length();
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
//		System.out.println(len4);
//		System.out.println(len1);
		System.out.println(s5.toString());
		
	}

}
