package CastingDemo;

public class Sample1 {

	public static void main(String[] args) {

		// casting
		// primitive casting

		// 1 implicit casting
		// converting lower type of data into higher type
		short a = 20;
		System.out.println(a);
		double d = a;
		System.out.println(d);

		// 2 explicit casting
		// converting higher type of data into lower type
		double d2 = 20.30;
		System.out.println(d2);
		short a2 = (short) d2;
		System.out.println(a2);

		long l = 20l;
		System.out.println(l);
		int i = (int) l;
		System.out.println(i);
		// 3 boolean casting
		System.out.println("+++++++++++++++");
		// non primitive casting

		Parent p = new Parent();
		System.out.println(p.age);
		p.demo_M1();
		p.add();// parent

		Child c = new Child();
		System.out.println(c.childAge);// child
		System.out.println(c.age);// parent
		c.demo_M2();// child
		c.demo_M1();// parent
		c.add();// child

		// upcasting

		Parent p1 = new Child();
		System.out.println(p1.age);
		p1.demo_M1();
		p1.add();// child

		// downcasting

		//double d=20.30;
		//int a=d;
		// Child c2 = (Child) new Parent();

	}

}
