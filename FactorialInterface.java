import java.rmi.*;
public interface  FactorialInterface extends Remote
{
	public int fact(int a) throws Exception;
}