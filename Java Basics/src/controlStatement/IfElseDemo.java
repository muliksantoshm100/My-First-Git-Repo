package controlStatement;

public class IfElseDemo {

	public static void main(String[] args) {
		System.out.println("START");
		// if(condition){
		// true block / if block
		// }
		int a = 20, b = 30;
		if (a < b) {
			System.out.println("b is greater ");
		}
		// if(condition){
		// true block / if block
		// }else{
		// false block / else block
		// }
		a = 40;
		if (a > b) {
			System.out.println("a is greater ");
		} else {
			System.out.println("b is greater");
		}
		// if(condition){
		// true block / if block
		// }else if(condition){
		// true block / if block
		// }

		int marks = 25;

		if (marks >= 65) {
			System.out.println("first class");
		} else if (marks > 35) {
			System.out.println("Pass");
		} else if (marks < 35) {
			System.out.println(" Failed");
		}

		// nested ifElse
		marks = 85;
		if (marks >= 65) {
			System.out.print("first class ");

			if (marks > 75) {
				System.out.println("with distinction");
			}
		} else if (marks > 35) {
			System.out.println("Pass");
		} else {
			System.out.println(" Failed");
		}

		System.out.println("END");
	}
}
