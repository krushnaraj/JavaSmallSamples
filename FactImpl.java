import java.rmi.*;
import java.rmi.server.*;
public class FactImpl extends UnicastRemoteObject implements GCDInterface
{
	public FactImpl() throws RemoteException
	{
		super();
	}
	public int Fact(int a) throws RemoteException
	{
		if(a==0||a==1)
		return 1;
		else
		return(a*fact(a-1));
	}
}