class CustData
{
	int custId = 555, custBal= 50000;
	String custName = "Peter Parker", custAccType= "Saving";
	
	void getCustData()
	{
		System.out.println("=========getCustData()========");
		System.out.println("Customer ID: "+custId);
		System.out.println("Customer Name: "+custName);
		System.out.println("Customer Balance: "+custBal);
		System.out.println("Customer Account Type: "+custAccType);
	}
}

class CustAddress
{
	String hNo = "22-lane,reverse", sName = "Time Square", city = "New York";
	int pinCode = 500001;
	
	void getCustAddress()
	{
		System.out.println("========getCustData()=======");
		System.out.println("House No.: "+hNo);
		System.out.println("Streat Name: "+sName);
		System.out.println("City: "+city);
		System.out.println("Pincode: "+pinCode);
	}
}

class CustContact
{
	String email = "friendlyneighborhoodspidy@gmail.com";
	long phNo = 8529637410L;
	
	void getCustContact()
	{
		System.out.println("========getCustContact()=======");
		System.out.println("Customer E-mail: "+email);
		System.out.println("Customer Phone No.: "+phNo);
	}
}

class CustDetails
{
	public static void main(String [] args)
	{
		System.out.println("CUSTOMER DETAILS");
		CustData cd = new CustData();
		cd.getCustData();
		
		CustAddress ca = new CustAddress();
		ca.getCustAddress();
		
		CustContact cc = new CustContact();
		cc.getCustContact();
	}
}