package VariablesDemo;

public class TypesOfVariable {

	// instance variable/ globe variable
	int age = 20;

	// static variable/ class variable 
	static String name = "Java";

	public static void main(String[] args) {

		// local variable
		// instance variable
		// static variable

		// local variable
		int a = 10;
		System.out.println(a);
		// System.out.println(b);
		// System.out.println(age);

		//static variable
		System.out.println(name);

		
		//Instance variable/ non-static variable 
		TypesOfVariable obj = new TypesOfVariable();
		System.out.println(obj.age);
		
		
	}

	void display() {

		// local variable
		int b = 20;
		System.out.println(b);
		// System.out.println(a);
		System.out.println(name);
		System.out.println(age);
	}

}
