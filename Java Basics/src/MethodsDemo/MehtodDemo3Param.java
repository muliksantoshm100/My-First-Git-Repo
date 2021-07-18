package MethodsDemo;

public class MehtodDemo3Param {

	static void add(int a, int b) {
		System.out.println(a);// 30
		System.out.println(b);// 50
		System.out.println("addition of two num=" + (a + b));
	}

	static void fullName(String fName, String sName) {
		System.out.println(fName + " - " + sName);
	}

	public static void main(String[] args) {

		System.out.println("Start");

		add(30, 50);
		sub(100, 48);
		fullName("Java", "Python");
		System.out.println("END");
	}

	static void sub(int x, int y) {
		System.out.println("substraction of " + x + " - " + y + " = " + (x - y));
	}

}
