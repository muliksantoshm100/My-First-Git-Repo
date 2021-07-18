package ExceptionDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThowAndThrows {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException   {

		//Throws
		//to declare an exception
		System.out.println("SATRT");
		Thread.sleep(3000);
		login();
		FileInputStream file=new FileInputStream("D:/abc.txt");
		
		System.out.println("END");
	}
	


	static void login() {
		//Throw
		//raise a customize exception
		System.out.println("login method");
		throw new RuntimeException();
		
	}

}
