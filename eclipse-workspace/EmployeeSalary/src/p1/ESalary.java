package p1;

public class ESalary 
{
	public float totSal;
	public void cal(int bsal)
	{
		totSal = bsal + (0.93f*bsal) + (0.63f*bsal);
	}
	
	public void getTotSal()
	{
		System.out.println("Total Salary is "+totSal);
	}
}
