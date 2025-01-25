class EmpData
{
	int empId = 301;
	String empName = "Dopindar";
	String empRole = "Software Engineer";
	
	void getEmpData()
	{
		System.out.println("====getEmpData()=====");
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Role: "+empRole);
	}
}

class EmpAddress
{
	String hNo = "h-22b";
	String sName = "RG Nagar";
	String city = "Hyderabad";
	int pinCode = 861234;
	
	void getEmpAddress()
	{
		System.out.println("====getEmpAddress()=====");
		System.out.println("House No. : "+hNo);
		System.out.println("Street Name: "+sName);
		System.out.println("City : "+city);
		System.out.println("Pincode : "+pinCode);
	}
}

class EmpContact
{
	String mailId = "deadpool@gmail.com";
	long phNo = 9898981234L;
	
	void getEmpContact()
	{
		System.out.println("===getEmpContact===");
		System.out.println("E-mail ID: "+mailId);
		System.out.println("Phone No: "+phNo);
	}
}

class EmployeeDetails
{
	public static void main(String args[])
	{
		EmpData ed = new EmpData();
		EmpAddress ea = new EmpAddress();
		EmpContact ec = new EmpContact();
		
		ed.getEmpData();
		ea.getEmpAddress();
		ec.getEmpContact();
	}
}