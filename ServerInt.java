package asss1;
import java.rmi.*;

interface ServerInt extends Remote{
	public double addition(double num1,double num2)throws RemoteException;

}
