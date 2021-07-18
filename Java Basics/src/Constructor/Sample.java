package Constructor;

public class Sample {
	//Constructor is special method of class
	//is used to initialize the state of an object
	int age;
	String name;
	
	Sample(int a, String n){
		age=a;
		name=n;
	}

	public static void main(String[] args) {

		Sample s1=new Sample(50, "Java");
		System.out.println(s1.age+"  "+ s1.name);
		
		Sample s2=new Sample(70, "Python");
		System.out.println(s2.age+"  "+ s2.name);		
	}

}
