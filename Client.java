package asss1;

import java.rmi.*;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			 String serverURL="rmi://localhost/Server";
			 ServerInt serverintf=(ServerInt)Naming.lookup(serverURL);
			 
			 System.out.print("Enter first number:");
			 double num1=sc.nextDouble();
			 
			 System.out.print("Enter second number:");
			 double num2=sc.nextDouble();
			 
			 System.out.println("First number is:"+ num1);
			 System.out.println("Second number is:"+ num2);
			 
			 System.out.println("........Result..........");
			 System.out.println("Addition is:"+serverintf.addition(num1,num2));
			 
		}catch(Exception e) {
			System.out.println("Exception occured at client" + e.getMessage());
			
		}
	}

}
