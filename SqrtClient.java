import java.rmi.*;
import java.rmi.server.*;
public class SqrtClient
{
	public static void main(String args[]) throws RemoteException
	{
		try
		{
			String url="SAMPLE-SERVER";
			SqrtInterface obj=(SqrtInterface)Naming.lookup(url);
			double z=obj.sqrt(16);
			System.out.println("Square Root of 16 is = "+z);
		}
		catch(Exception e)
		{}
	}
}