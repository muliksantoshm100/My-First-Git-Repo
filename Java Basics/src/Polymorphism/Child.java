package Polymorphism;

public class Child extends Parent {
	//method overriding
	//1 method name should same
	//2 class should be different bt the relation btwn then is Inheritance
	//3 method args should same
	  
	void add(int a, int b) {
		System.out.println("Child add="+(a+b));
	}
}
