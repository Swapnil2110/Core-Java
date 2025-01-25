import java.util.Scanner;

class CheckBranch
{
	boolean k = false;
	boolean check(String stuBranch)
	{
		switch(stuBranch)
		{
			case "CSE": k = true;
						break;
						
			case "ECE": k = true;
						break;
						
			case "EEE": k = true;
						break;
		}//end of switch
		return k;
	}
}

class Calculate
{
	int totMarks;
	double percentage;
	String result;
	boolean b;
	void cal(int s1,int s2,int s3,int s4,int s5,int s6,boolean b)
	{
		totMarks = s1+s2+s3+s4+s5+s6;
		percentage = totMarks/6;
		if(b)
		{
			result="Fail";
		}
		else if(percentage<100 && percentage>=70)
		{
			result = "Distinction";
		}
		else if(percentage<70 && percentage>=60)
		{
			result = "First Class";
		}
		else if(percentage<60 && percentage>=50)
		{
			result = "Second Class";
		}
		else if(percentage<50 && percentage>=35)
		{
			result = "Third Class";
		}
		else
		{
			result = "Fail";
		}
	}
	void getDetails()
	{
		System.out.println("Total Marks = "+totMarks);
		System.out.println("Percentage = "+percentage);
		System.out.println("Result = "+result);
	}
}

class StudentDetails
{
	String stuName, stuBranch;
	int rollNo;
	void setStudentDetails(String a,String b,int c)
	{
		stuName = a;
		stuBranch = b;
		rollNo = c;
	}
	void getStudentDetails()
	{
		System.out.println("Student Name : "+stuName);
		System.out.println("Student Branch: "+stuBranch);
		System.out.println("Student Roll no.: "+rollNo);
	}
}
class StuMainClass//main class
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String stuName = s.nextLine();
		
		System.out.println("Enter Student Branch: ");
		String stuBranch = s.nextLine();
		CheckBranch cb = new CheckBranch();
		boolean j = cb.check(stuBranch);
		
		if(j)
		{
			System.out.println("Enter Roll No. : ");
			int rollNo = s.nextInt();
			
			System.out.println("Enter marks s1: ");
			int s1 = s.nextInt();
			System.out.println("Enter marks s2: ");
			int s2 = s.nextInt();
			System.out.println("Enter marks s3: ");
			int s3 = s.nextInt();
			System.out.println("Enter marks s4: ");
			int s4 = s.nextInt();
			System.out.println("Enter marks s5: ");
			int s5 = s.nextInt();
			System.out.println("Enter marks s6: ");
			int s6 = s.nextInt();
			
			StudentDetails sd = new StudentDetails();
			sd.setStudentDetails(stuName,stuBranch,rollNo);
			sd.getStudentDetails();
			boolean b = false;
			if(	(s1>=0&&s1<=100) && (s2>=0&&s2<=100) && (s3>=0&&s3<=100)&&
				(s4>=0&&s4<=100) && (s5>=0&&s5<=100) && (s6>=0&&s6<=100)	)
			{
				if(s1<35 || s2<35 || s3<35 || s4<35 || s5<35 || s6<35)
				{
					b = true;
				}
				Calculate c = new Calculate();
				c.cal(s1,s2,s3,s4,s5,s6,b);
				c.getDetails();
			}
			else
			{
				System.out.println("Please enter subject marks correctly.");
			}
			
			
			
		}//end of if
		else
		{
			System.out.println("Please enter valid branch.");
		}
		
	}
}