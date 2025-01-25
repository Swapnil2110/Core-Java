package p2;
import java.util.Scanner;
import p1.ESalary; //by using '*' instead of class name we can use all classes of package p1 inside p2
public class EmpMainClass
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Basic salary: ");
		int bsal =  s.nextInt();
		if(bsal>=12000)
		{
			ESalary es = new ESalary();
			es.cal(bsal);
			es.getTotSal();
		}
		else
		{
			System.out.println("Invalid Basic Salary.");
		}
		s.close();
	}
}
