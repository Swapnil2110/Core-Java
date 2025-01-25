package Calculate1;

public class Calculate 
{
	public int totMarks;
	public float per;
	public String result;
	
	public void cal(int s1, int s2, int s3, int s4, int s5, int s6, boolean p)
	{
		totMarks = s1+s2+s3+s4+s5+s6;
		per = (float)totMarks/6;
		if(p)
		{
			result = "Fail";
		}
		else if(per>=70 && per<=100)
		{
			result = "Destinction";
		}
		else if(per>=60 && per<70)
		{
			result = "First Class";
		}
		else if(per>=50 && per<60)
		{
			result = "Second Class";
		}
		else if(per>=35 && per<50)
		{
			result = "Third Class";
		}
		else
		{
			result = "FAIL";
		}
	}
	
	public void getDetails()
	{
		System.out.println("Total Marks : "+totMarks);
		System.out.println("Percentage : "+per);
		System.out.println("Result : "+result);
	}
}
