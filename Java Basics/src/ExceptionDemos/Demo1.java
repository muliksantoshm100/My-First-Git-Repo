package ExceptionDemos;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException  {
		
		int a=25;
		int b=0;
		
		System.out.println("Start");
		
		System.out.println(a);
		System.out.println(b);
//		System.out.println(a/b);
		
		Thread.sleep(2000);
		int arr[]= {10};
		
		System.out.println(arr[2]);
		
		System.out.println("END");
		
	}

}
