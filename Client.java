import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client{
	public static void main(String[] args){
		try{
			Registry registry=LocateRegistry.getRegistry("127.0.0.1",4000);
			Circle circle=(Circle)registry.lookup("rmi://localhost:4000/circle");
			int Radius;
			Scanner in= new Scanner(System.in);
			System.out.println("Enter radius: ");
			Radius=in.nextInt();
			System.out.println("area :"+circle.getArea(Radius));
			System.out.println("perimeter :"+circle.getPerimeter(Radius));
		}catch(Exception e){
			System.out.println("client error"+e);
		}
	}
}
