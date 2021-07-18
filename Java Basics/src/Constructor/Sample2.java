package Constructor;

public class Sample2 {

	//constructor
	//default constructor
	//when programmer does not add any constructor method
	//in code, then JVM adds its own constructor.
	
//	Sample2(){
//	
//	}
	
	int age;
	String name;
	//user defined constructor
	//non parameterized cont
	//parameterized cont

	//rules to create constructor 
	//constructor name should be same as class name
	//dose not have any return type
	
	Sample2(){
		System.out.println("this is non para cont");
	}

	Sample2(int a, String n){
		age=a;
		name=n;
		System.out.println("this is para-cont");
	}

	public static void main(String[] args) {
		
		Sample2 obj=new Sample2();
		obj.age=20;
		System.out.println(obj.age);
		
		Sample2 obj2=new Sample2(20,"Java");
		System.out.println(obj2.name);
		
	}
}
