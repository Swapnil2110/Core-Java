class UserDetails
{
	public static void main(String[] args)
	{
		System.out.println("USER DETAILS");
		
		UserData ud = new UserData();
		ud.getUserData();
		
		UserAddress ua = new UserAddress();
		ua.getUserAddress();
		
		UserContact uc = new UserContact();
		uc.getUserContact();
	}
}

class UserData
{
	String userName = "Spider-man", passWord = "I_am_parker", firstName = "Peter", lastName = "Parker";
	
	void getUserData()
	{
		System.out.println("===getUserData()===");
		System.out.println("User Name: "+userName);
		System.out.println("Password: "+passWord);
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
	}
}

class UserAddress
{
	String hNo = "8/23, dead building", sName = "brbr streat", city = "Nagpur";
	int pinCode = 5001234;
	
	void getUserAddress()
	{
		System.out.println("===getUserAddress===");
		System.out.println("House No.: "+hNo);
		System.out.println("Streat Nmae: "+sName);
		System.out.println("City: "+city);
		System.out.println("Pincode: "+pinCode);
	}
}

class UserContact
{
	String mailId = "dr_strangethewizard@gmail.com";
	long phNo = 7485960123L;
	
	void getUserContact()
	{
		System.out.println("===getUserContact()===");
		System.out.println("E-mail ID: "+mailId);
		System.out.println("Phone Number: "+phNo);
	}
}