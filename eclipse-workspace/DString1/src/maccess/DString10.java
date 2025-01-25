package maccess;
import java.util.Scanner;
public class DString10 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter roll number: ");
		String rollNo = s.nextLine().toUpperCase();
		if(rollNo.length()==10)
		{
			String yoj = rollNo.substring(0, 2);
			String collegeCode = rollNo.substring(2, 6);
			String brCode = rollNo.substring(6, 8);
			String no = rollNo.substring(8,10);
			System.out.println("Roll Number : "+rollNo);
			System.out.println("Year of Joining : 20"+yoj);
			System.out.println("College Code : "+collegeCode);
			System.out.println("Branch : "+brCode);
			System.out.println("Branch Name : ");
			switch(Integer.parseInt(brCode))
			{
				case 05:
					System.out.println("CSE"); 
					break;
				case 04:
					System.out.println("IT");
					break;
				case 03:
					System.out.println("Mech");
					break;
				case 02:
					System.out.println("EP");
					break;
				case 01:
					System.out.println("EXTC");
					break;
					
			}
			System.out.println("Number : "+no);
		}
		else
		{
			System.out.println("Invalide Roll number");
		}
		s.close();
	}
}
