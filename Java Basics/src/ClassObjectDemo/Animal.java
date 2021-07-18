package ClassObjectDemo;

public class Animal {

	int age = 20;

	String name = "ABC";

	String color = "Black";

	//static keyword is used mainly for memory management purpose
	//static shows common properties to all objects
	
	static String owner="Ram";
	
	public static void main(String[] args) {

		//Classname objname= new ClassConstructor();
		
		Animal cat=new Animal();
		cat.name="Tom";
		System.out.println(cat.name);
		cat.color="White";
		System.out.println(cat.color);
		cat.eat();
		cat.run();
		System.out.println("++++++++++");
		System.out.println(owner);
		cat.owner="Java";
		System.out.println(cat.owner);
		System.out.println("++++++++++");
		Animal dog=new Animal();
		dog.name="PQR";
		dog.color="Brown";
		System.out.println(dog.name);
		System.out.println(dog.color);
		dog.eat();
		dog.run();
		System.out.println("++++++++++");
		System.out.println(owner);
		System.out.println(dog.owner);
		
	}

	  void eat() {
		System.out.println("eating");
	}

	void run() {
		System.out.println("running");
	}
}
