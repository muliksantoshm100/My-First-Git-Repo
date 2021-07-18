package This_Super_Final;

public class Child extends Parent{

	Child(){
		super();
		//this();
	}

	void display() {
		System.out.println(super.age);
		super.demo();
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
	}
}
