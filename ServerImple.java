package asss1;
import java.rmi.*;
import java.rmi.server.*;

public class ServerImple extends UnicastRemoteObject implements ServerInt{
	
	public ServerImple() throws RemoteException{
		
	}
	public double addition(double num1,double num2)throws RemoteException{
		return num1+num2;
	}
	

}

