package maccess;
import java.util.Scanner;
public class DString2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s1 = s.nextLine();
		System.out.println("Enter String 2: ");
		String s2 = s.nextLine();
		
		System.out.println("***equals() method***");
		System.out.println(s1.equals(s2));
		System.out.println("***equalsIgnoreCase() method***");
		System.out.println(s1.equalsIgnoreCase(s2));
		s.close();
	}
}
