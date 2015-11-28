import java.rmi.*;
import java.rmi.server.*;
public class FactorialImpl extends UnicastRemoteObject implements FactorialInterface
{
	public FactorialImpl() throws RemoteException
	{
		super();
	}
	public int fact(int a) throws RemoteException
	{
		if(a==0||a==1)
		return 1;
		else
		return(a*fact(a-1));
	}
}