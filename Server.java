package asss1;
import java.rmi.*;

public class Server {
	public static void main(String[] args){
		try {
			ServerImple serverImple=new ServerImple();
			Naming.rebind("Server", serverImple);
			System.out.println("server started");
		}catch(Exception e) {
			System.out.println("Exception occured at server"+e.getMessage());
		}
	}

}
