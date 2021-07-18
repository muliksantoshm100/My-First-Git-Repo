package This_Super_Final;

public class Sample {

	int age;
	String name;
	
	public Sample(int age, String name) {
		this();
		this.age=age;
		this.name=name;
		this.add();
		demo(this);
	}

	void add() {
		System.out.println("add method");
	}
	public Sample() {
		System.out.println("constructor");
	}

	void demo(Sample obj) {
		System.out.println("demo method");
		System.out.println(obj.age);
		System.out.println(obj.name);
	}
	
	Sample demo2() {
		return this;
	}
	public static void main(String[] args) {

		Sample obj=new Sample(20,"Java");
		System.out.println(obj.age);
		System.out.println(obj.name);
	}

}
