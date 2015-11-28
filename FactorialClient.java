import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class FactorialClient
{
	public static void main(String args[]) throws RemoteException
	{
		try
		{
			Scanner c=new Scanner(System.in);
			System.out.println("Enter a Number :");
			int a=c.nextInt();
			String url="SAMPLE-SERVER";
			FactorialInterface obj=(FactorialInterface)Naming.lookup(url);
			long z=obj.fact(a);
			System.out.println(a+"! is = "+z);
		}
		catch(Exception e)
		{}
	}
}