import java.util.Scanner;

class Addition
{
	int add(int v1, int v2)
	{
		return v1+v2;
	}
}
class Subtraction
{
	int sub(int v1,int v2)
	{
		return v1-v2;
	}
}
class Multiplication
{
	int mul(int v1, int v2)
	{
		return v1*v2;
	}
}
class Division
{
	double div(int v1, int v2)
	{
		return (double)v1/v2;
	}
}
class ModDivision
{
	int mod(int v1,int v2)
	{
		return v1%v2;
	}
}

class Arithmetic
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value1 = "); 
		int v1 = s.nextInt(); //store value in v1 
		
		System.out.println("Enter value2 = ");
		int v2 = s.nextInt(); //store value in v2
		
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivision");		
		System.out.println("===CHOICES==="); //user enter choice to perform operation
		int choice = s.nextInt(); //choice value get stored in "choice" Local variable
		
		switch(choice)
		{
			case 1:	Addition ad = new Addition();
					int r1 = ad.add(v1,v2);
					System.out.println("Addition of "+v1+" and "+v2+" = "+r1);
					break;
					
			case 2:	Subtraction sb = new Subtraction();
					int r2 = sb.sub(v1,v2);
					System.out.println("Subtraction of "+v1+" and "+v2+" = "+r2);
					break;
					
			case 3: Multiplication ml = new Multiplication();
					int r3 = ml.mul(v1,v2);
					System.out.println("Multiplication of "+v1+" and "+v2+" = "+r3);
					break;
					
			case 4: Division dv = new Division();
					double r4 = dv.div(v1,v2);
					System.out.println("Division of "+v1+" and "+v2+" = "+r4);
					break;
					
			case 5: ModDivision md = new ModDivision();
					int r5 = md.mod(v1,v2);
					System.out.println("ModDivision of "+v1+" and "+v2+" = "+r5);
					break;
			
			default:
					System.out.println("INVALID CHOICE, Please enter again.");
		}
	}
}