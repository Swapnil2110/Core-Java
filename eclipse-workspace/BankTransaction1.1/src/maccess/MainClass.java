package maccess;
import java.util.*;
import test.*;

public class MainClass 
{
	public static Account ac = new Account();
	//main method
	public static void main(String[] args)
	{
		ac.setBalance(5000);
		new Ch().choose();
	}
}
