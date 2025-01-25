import java.util.Scanner;
class DemoConstructor3
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		//take input values from user
		System.out.println("Enter User Name: ");
		String uN = s.nextLine();
		System.out.println("Enter PassWord: ");
		String pW = s.nextLine();
		System.out.println("Enter First Name: ");
		String fN = s.nextLine();
		System.out.println("Enter Last Name: ");
		String lN = s.nextLine();
		System.out.println("Enter Address: ");
		String addr = s.nextLine();
		System.out.println("Enter MailID: ");
		String mailID = s.nextLine();
		System.out.println("Enter Phone Number: ");
		long phNo = s.nextLong();
		
		UserDetails ud = new UserDetails(uN, pW, fN, lN, addr, mailID,phNo);
		ud.getUserDetails();
		
	}
}

class UserDetails
{
	String userName, passWord, firstName, lastName, address, mailID;
	long phoneNo;
	UserDetails(String a,String b,String c,String d,String e,String f,long g)
	{
		userName = a;
		passWord = b;
		firstName = c;
		lastName = d;
		address = e;
		mailID = f;
		phoneNo = g;
	}
	void getUserDetails()
	{
		System.out.println("***USER_DETAILS***");
		System.out.println("User Name: "+userName);
		System.out.println("Password: "+passWord);
		System.out.println("First Name: "+ firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Address: "+address);
		System.out.println("E-mail ID: "+mailID);
		System.out.println("Phone Number: "+phoneNo);
		
	}
}