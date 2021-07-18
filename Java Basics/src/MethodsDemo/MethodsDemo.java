package MethodsDemo;

public class MethodsDemo {
	//a set of code which  perform a particular task
	
	//access-specifier returnType methodName(parameter list){
	//method body
	//}
	
	//returnType methodName(){
	//method body
    //}
	
	//advantages of method
	//code reusability
	//code optimization
	
	void add() {
		System.out.println("addition is prforming");
	}
	
	static void sub() {
		System.out.println("substartion");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		//static method in same class
		sub();
		
		//non static method in same class
		MethodsDemo obj=new MethodsDemo();
		obj.add();
		
		//static method from another class
		MethodDemo2.m2();
		
		//non static method from another class
		MethodDemo2 obj2=new MethodDemo2();
		obj2.m1();
	}

}
