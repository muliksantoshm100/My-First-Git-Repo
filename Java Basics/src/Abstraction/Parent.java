package Abstraction;

public abstract class Parent {

	//abstract method/ incomplete method
	abstract void add();
	
	//non abstract method / complete method
	void sub() {
		System.out.println("substraction");
	}
}
