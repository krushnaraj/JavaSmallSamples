import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class SqrtServer
{
	public SqrtServer()
	{
		try
		{
			SqrtInterface server=new SqrtImpl();
			Naming.rebind("SAMPLE-SERVER",server);
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[])
	{
		new SqrtServer();
	}
}