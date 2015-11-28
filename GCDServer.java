import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class GCDServer
{
	public GCDServer()
	{
		try
		{
			GCDInterface server=new GCDImpl();
			Naming.rebind("SAMPLE-SERVER",server);
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[])
	{
		new GCDServer();
	}
}