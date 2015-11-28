import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class FactorialServer
{
	public FactorialServer()
	{
		try
		{
			FactorialInterface server=new FactorialImpl();
			Naming.rebind("SAMPLE-SERVER",server);
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[])
	{
		new FactorialServer();
	}
}