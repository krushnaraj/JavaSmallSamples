import java.rmi.*;
import java.rmi.server.*;
public class GCDClient
{
	public static void main(String args[]) throws RemoteException
	{
		try
		{
			String url="SAMPLE-SERVER";
			GCDInterface obj=(GCDInterface)Naming.lookup(url);
			int z=obj.gcd(20,36);
			System.out.println("GCD of Tow Numbers is = "+z);
		}
		catch(Exception e)
		{}
	}
}