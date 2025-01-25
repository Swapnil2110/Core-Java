package StuMainClass1;

public class StuMainClass 
{
	public static void main(String[] args)
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
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
		
		boolean p = false;
		if(	(s1>=0 && s1<=100)&&(s2>=0 && s2<=100)&&(s3>=0 && s3<=100)&&
			(s4>=0 && s4<=100)&&(s5>=0 && s5<=100)&&(s6>=0 && s6<=100)	)
		{
			if(s1<=34 || s2<=34 || s3<=34 || s4<=34 || s5<=34 || s6<=34)
			{
				p = true;
			}
			Calculate1.Calculate c = new Calculate1.Calculate();
			c.cal(s1,s2,s3,s4,s5,s6,p);
			c.getDetails();	
		}
		else
		{
			System.out.println("Invalid Subject marks.");
		}
		s.close();
		
	}
}
