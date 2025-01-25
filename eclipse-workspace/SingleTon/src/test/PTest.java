package test;

public class PTest 
{
	private static PTest ob = new PTest();
	private PTest() {}
	public static PTest getRef()
	{
		return ob;
	}
	public void dis(int k)
	{
		System.out.println("===public dis(k)===");
		System.out.println("The value k: "+k);
	}

}
