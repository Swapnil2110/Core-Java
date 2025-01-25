package p1;

public class CheckPin 
{
	public boolean k = false;
	public boolean checkPin(int pin)
	{
		switch(pin)
		{
			case 1111:	k=true;
						break;
			case 2222:	k=true;
						break;
			case 3333:	k=true;
						break;
			default:	k=false;
						break;
		}
		return k;
	}
}
