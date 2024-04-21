import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Circle extends Remote{
	public double getArea(int Radius)throws RemoteException;
	public double getPerimeter(int Radius) throws RemoteException;
}
