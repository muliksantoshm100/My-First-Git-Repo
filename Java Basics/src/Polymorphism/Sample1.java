package Polymorphism;

public class Sample1 {

	//Compile time polymorphism
	
	//method overloading
	//1- method name should same
	//2- class should same
	//3- method args should be different
	// on the basis of
	     //number of parametrs
		 //sequence of parameter
		 //types of parameter
	
	void add() {
		System.out.println("Addition of 20+30="+(20+30));
	}
	
	void add(int a) {
		System.out.println("Addition of 20+"+a);
		System.out.println(a+20);
	}
	
	void add(int a, int b) {
		System.out.println("Addition of two nums="+(a+b));
	}
	
	void add(String s, int b) {
		System.out.println(s);
		System.out.println(b);
	}
	
	void add(int a, String s) {
		System.out.println(a);
		System.out.println(s);
	}
	
	void add(String fName, String lName) {
		System.out.println(fName+" "+lName);
	}
	
	public static void main(String[] args) {
		
		Sample1 obj=new Sample1();
		obj.add();
		obj.add(60);
		obj.add(50, 70);
		obj.add("Java",10);
		obj.add(10,"Python");
		obj.add("Java", "Python");
	}
}
