import java.util.Scanner;

class Calculate
{
	int totMarks;
	double percentage;
	
	void cal(int s1, int s2, int s3, int s4, int s5, int s6)
	{
		totMarks = s1+s2+s3+s4+s5+s6;
		percentage = (double)totMarks/6;
	}
	
	void getDetails()
	{
		System.out.println("Total Marks = "+totMarks);
		System.out.println("Percentage = "+percentage);
	}
}

class StuMainClass
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks of S1: ");
		int s1 = s.nextInt();	
		
		System.out.println("Enter marks of S2: ");
		int s2 = s.nextInt();
		
		System.out.println("Enter marks of S3: ");
		int s3 = s.nextInt();
		
		System.out.println("Enter marks of S4: ");
		int s4 = s.nextInt();
		
		System.out.println("Enter marks of S5: ");
		int s5 = s.nextInt();
		
		System.out.println("Enter marks of S6: ");
		int s6 = s.nextInt();
		
		Calculate ob = new Calculate();
		ob.cal(s1,s2,s3,s4,s5,s6);
		ob.getDetails();
		
	}
}