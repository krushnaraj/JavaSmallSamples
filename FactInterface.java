import java.rmi.*;
public interface  FactInterface extends Remote
{
	public int fact(int a) throws Exception;
}