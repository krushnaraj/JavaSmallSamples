import java.rmi.*;
public interface  SqrtInterface extends Remote
{
	public double sqrt(int a) throws Exception;
}