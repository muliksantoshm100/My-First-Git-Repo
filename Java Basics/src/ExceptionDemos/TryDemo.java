package ExceptionDemos;

public class TryDemo {

	public static void main(String[] args) {

		int a = 20;
		int b = 0;
		System.out.println("START");

		// try{
		// risky code
		// }
		// catch(Exception e){
		// handling code
		// }

		// try{
		// risky code
		// }
		// finally{
		// handling code
		// }

		int arr[] = { 20 };
		try {
			System.out.println("try block");
			// risky code
			 System.out.println(a/b);
			//System.out.println(arr[2]);

		} 
		catch (ArithmeticException r) {
			System.out.println(r);
		}
		catch (RuntimeException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Does not devaide by zero ");
		}
		
		finally {
			// to do the important work
			System.out.println("finally block");

		}

		System.out.println("END");
	}

}
