package maccess;

import java.util.Scanner;
import static java.lang.Math.*;
public class DImport 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value: ");
		double d = s.nextDouble();
		double z = sqrt(d);
		System.out.println("sqrt of "+d+" is "+z);
		s.close();
	}
}
