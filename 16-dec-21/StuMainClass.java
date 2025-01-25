import java.util.Scanner;

class Calculate
{
	int totMarks;
	double percentage;
	String result;
	
	void cal(int s1, int s2, int s3, int s4, int s5, int s6, boolean p)
	{
		totMarks = s1+s2+s3+s4+s5+s6;
		percentage = (double)totMarks/6;
		
		if(p==true)
		{
			result="Fail";
		}
		else if(percentage>=70 && percentage<=100)
		{
			result="Distinction";
		}
		else if(percentage>=60 && percentage<70)
		{
			result="First Class";
		}
		else if(percentage>=50 && percentage<60)
		{
			result="Second Class";
		}
		else if(percentage>=35 && percentage<50)
		{
			result= "Third Class";
		}
		else
		{
			result="Fail!";
		}
	}
	
	void getDetails()
	{
		System.out.println("Total Marks = "+totMarks);
		System.out.println("Percentage = "+percentage);
		System.out.println("Result = "+result);
	}
}

class StuMainClass
{
	public static void main(String[] args)
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
		boolean p = false;
		
		if(	(s1>=0&&s1<=100)&&(s2>=0&&s2<=100)&&
			(s3>=0&&s3<=100)&&(s4>=0&&s4<=100)&&
			(s5>=0&&s5<=100)&&(s6>=0&&s6<=100)	)
		{	
			if(s1<35 || s2<35 || s3<35 || s4<35 || s5<35 || s6<35)
			{
				p = true;
			}
			Calculate ob = new Calculate();
			ob.cal(s1,s2,s3,s4,s5,s6,p);
			ob.getDetails();
		}//end of if
		else
		{
			System.out.println("Invalide input. try again");
		}
	}
}