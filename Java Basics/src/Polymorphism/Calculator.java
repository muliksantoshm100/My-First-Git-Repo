package Polymorphism;

class SciCal{
	
	void add(int a, int b) {
		System.out.println("Parent class method");
	}
	
	static void sub(int a, int b) {
		System.out.println("static methos from parent");
	}
	
	private void add() {
		System.out.println("");
	}
}


public class Calculator extends SciCal{
	
	void add(int a, int b) {
		System.out.println("int method");
		System.out.println(a+b);
	}
	void add(float a, float b) {
		System.out.println("double");
		System.out.println(a+b);
	}
	
//	void sub(int a, int b) {
//		System.out.println("static method sub");
//	}

	void add() {
		System.out.println("private method");
	}
	
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(10, 20);
		obj.add(20.5f, 30.4f);
		//main(10);
	}
//	
//	public static void main(int args) {
//		System.out.println("int type main method val="+10);
//	}
//	
	

}



