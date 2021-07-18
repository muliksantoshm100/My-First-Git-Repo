package Abstraction;

public class Child_Inter implements Demo_Interface, Demo_Interface2 {

	public void add() {
		System.out.println("child add method");
	}

	public void sub() {
		System.out.println("child sub mehtod");
	}

	public void multi() {
		System.out.println("child multi method");
	}

	public static void main(String[] args) {
		// upcasting
		Demo_Interface obj = new Child_Inter();
		obj.add();
		obj.sub();
		// obj.multi();
		System.out.println(AGE);

		Demo_Interface2 obj2 = new Child_Inter();
		obj2.add();
		// obj2.sub();
		obj2.multi();
	}

}
