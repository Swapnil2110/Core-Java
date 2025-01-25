package maccess;
import test.*;
import java.util.*;
public class CalculatorMainClass 
{
	public static void main(String[] args)
	{
		//Addition ad = new Addition();
		//ad.calculate(100, 22);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number :");
		int x = s.nextInt();
		System.out.println("Enter second number :");
		int y = s.nextInt();
		//enter choice
		System.out.println("Enter your Choice:");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Mod-Division");
		int ch = s.nextInt();
		
		//switch case
		switch(ch)
		{
			case 1: 
				Addition ad = new Addition();
				ad.calculate(x, y);
				break;
			case 2:
				Subtraction sb = new Subtraction();
				sb.calculate(x, y);
				break;
			case 3:
				Multiplication ml = new Multiplication();
				ml.calculate(x, y);
				break;
			case 4:
				Division d = new Division();
				d.calculate(x, y);
				break;
			case 5: 
				ModDivision md = new ModDivision();
				md.calculate(x, y);
				break;
		}//end of switch case
		s.close();
	}
}
