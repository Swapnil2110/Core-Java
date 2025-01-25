package reverse_string_stringBuffer;
import java.util.*;
public class main 
{

	public static void main(String[] args) 
	{
		System.out.println("enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringBuffer sb = new StringBuffer(str);
//		sb.append("\nrahul");
//		System.out.println();
//		sb.append("kumar");
		sb.reverse();
		System.out.println(sb);
		s.close();
	}

}
