
public class StatikDemo {

	//static is used for memory management perpose
	//static shows common properties to all object
	//we did not need to create any object to call the static things
	
	static int abc=10;
	
	int age=20;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(abc);
		StatikDemo obj=new StatikDemo();
				
		System.out.println(obj.age);
	}

}
