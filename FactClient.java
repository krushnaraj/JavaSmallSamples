import java.rmi.*;
import java.rmi.server.*;
public class FactClient
{
	public static void main(String args[]) throws RemoteException
	{
		try
		{
			String url="SAMPLE-SERVER";
			FactInterface obj=(FactInterface)Naming.lookup(url);
			int z=obj.fact(5);
			System.out.println("5! is = "+z);
		}
		catch(Exception e)
		{}
	}
}