class StuDetails
{
	public static void main(String []args)
	{
		StuData sd = new StuData();
		sd.getStuData();
		
		StuAddress sa = new StuAddress();
		sa.getStuAddress();
		
		StuContact sc = new StuContact();
		sc.getStuContact();
	}
}

class StuData
{
	int stuRollNo = 78;
	String stuName = "Dopindar Jr.";
	String stuBranch = "X-Men";
	
	void getStuData()
	{
		System.out.println("===getStuData()===");
		System.out.println("Student Roll No.: "+stuRollNo);
		System.out.println("Student Name: "+stuName);
		System.out.println("Student Branch: "+stuBranch);
	}
}

class StuAddress
{
	String hNo = "Xavier";
	String sName = "X street";
	String city = "New York";
	int pinCode = 506321;
	
	void getStuAddress()
	{
		System.out.println("=====getStuAddress()======");
		System.out.println("House Number: "+hNo);
		System.out.println("street Name: "+sName);
		System.out.println("City: "+city);
		System.out.println("Pin Code: "+pinCode);
	}
}

class StuContact
{
	String stuMailId = "marvels_xmen@gmail.com";
	long stuPhNo = 6969696969L;
	
	void getStuContact()
	{
		System.out.println("====getStuContact=====");
		System.out.println("E-mail Id: "+stuMailId);
		System.out.println("Phone No.: "+stuPhNo);
	}
}