import java.rmi.*;
import java.rmi.server.*;
import java.lang.Math.*;
public class SqrtImpl extends UnicastRemoteObject implements SqrtInterface
{
	public SqrtImpl() throws RemoteException
	{
		super();
	}
	public double sqrt(int a) throws RemoteException
	{
		return(Math.sqrt(a));
	}
}