package replace;
import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter tour String");
		String str = s.nextLine();
		System.out.println("your string is \n"+str);
		String replace1 = str.replaceAll("I","j");
		String replace = replace1.replaceAll("J","I");
		System.out.println("after replacing");
		System.err.println(replace);
		s.close();
	}

}
