import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CircleImpl extends UnicastRemoteObject implements Circle{
	private double PI;
	
	public CircleImpl()throws RemoteException{
		super();
		PI=22.0/7.0;
	}
	
	@Override
	public double getArea(int Radius){
		return PI*Radius*Radius;
	}
	@Override
	public double getPerimeter(int Radius){
		return 2*PI*Radius;
	}
}
