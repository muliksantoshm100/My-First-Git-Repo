package MethodsDemo;

public class MethodDemo4Return {

	static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	static String fullName(String fName, String lName) {
		String name=fName+" "+lName;
		return name;
	}
	public static void main(String[] args) {

		int sum=add(50,40);
		System.out.println("After addition sum = "+sum);
		
		String str = fullName("Ramesh", "Rathod");
		System.out.println(str);
		
	}

}
