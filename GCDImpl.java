import java.rmi.*;
import java.rmi.server.*;
public class GCDImpl extends UnicastRemoteObject implements GCDInterface
{
	public GCDImpl() throws RemoteException
	{
		super();
	}
	public int gcd(int a,int b) throws RemoteException
	{
		if(b==0)
		{
			return a;
		}
		else if(b>a)
		{
			return gcd(b,a);
		}
		else
		{
			return gcd(b,a%b);
		}
	}
}