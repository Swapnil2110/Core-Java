import java.util.Scanner;
class ArithmeticMainClass
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value1: ");
		int v1 = s.nextInt();
		
		System.out.println("Enter value2: ");
		int v2 = s.nextInt();
		
		System.out.println("Choice: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivision");
		System.out.println("Enter your Choice: ");
		int choice = s.nextInt();
		
		switch(choice)
		{
			case 1:
					Addition ad = new Addition();
					int r1 = ad.add(v1,v2);
					System.out.println("Sum = "+r1);
					break;
			case 2:
					Subtraction sb = new Subtraction();
					int r2 = sb.subtract(v1,v2);
					System.out.println("Subtraction = "+r2);
					break;
			case 3:
					Multiplication ml = new Multiplication();
					int r3 = ml.multiply(v1,v2);
					System.out.println("Multiplication = "+r3);
					break;
			case 4:
					Division dv = new Division();
					float r4 = dv.division(v1,v2);
					System.out.println("Division = "+r4);
					break;
			case 5:
					ModDivision md = new ModDivision();
					int r5 = md.modDiv(v1,v2);
					System.out.println("Mod Division = "+r5);
					break;
			default:
					System.out.println("Invalid Choice.");			
		} //end of switch
	}
}

class Addition//sub-class1
{
	int add(int v1, int v2) //Return-type Instance method with parameters
	{
		return v1+v2;
	}
}
class Subtraction//sub-class2
{
	int subtract(int v1, int v2) //Return-type Instance method with parameters
	{
		return v1-v2;
	}
}
class Multiplication//sub-class3
{
	int multiply(int v1, int v2) //Return-type Instance method with parameters
	{
		return v1*v2;
	}
}
class Division//sub-class4
{
	float division(int v1, int v2) //Return-type Instance method with parameters
	{
		return (float)v1/v2;
	}
}
class ModDivision//sub-class5
{
	int modDiv(int v1, int v2) //Return-type Instance method with parameters
	{
		return v1%v2;
	}
}