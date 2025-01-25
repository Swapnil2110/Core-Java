package binary;
import java.util.*;
public class main {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter an integer value");
		int num = s.nextInt();
		System.out.println("your interger = "+num);
		System.out.println("binary value is = "+Integer.toBinaryString(num));
		s.close();
		
	}
}
