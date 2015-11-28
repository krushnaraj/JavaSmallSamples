import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class FactServer
{
	public FactServer()
	{
		try
		{
			FactInterface server=new FactImpl();
			Naming.rebind("SAMPLE-SERVER",server);
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[])
	{
		new FactServer();
	}
}