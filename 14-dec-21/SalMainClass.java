import java.util.Scanner;

class Calculate //sub class
{
	double totSal;
	void cal(int bSal)
	{
		totSal = bSal+(0.96*bSal)+(0.53*bSal);
	}
	
	void getTotSal()
	{
		System.out.println("Total Salary of Employee = "+totSal);
	}
}

class SalMainClass //Main Class
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Basic Salary: ");
		int bSal = s.nextInt();
		
		Calculate ob = new Calculate();
		ob.cal(bSal);
		ob.getTotSal();
	}
}