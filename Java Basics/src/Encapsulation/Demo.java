package Encapsulation;

public class Demo {
		
	//wraping data and code together in a single unite
	
	//- all the data members should be declare as private
	//- accessing those data we need to create getter or setter methods
	
	//data security
	//class can be only readable or writable or both
	
	//pojo 
	private String name="USER-Confidantial-data";
	private int age;
	
	//readable
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	//writable
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}
