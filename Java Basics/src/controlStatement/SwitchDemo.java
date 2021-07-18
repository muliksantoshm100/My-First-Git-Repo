package controlStatement;

public class SwitchDemo {

	public static void main(String[] args) {

		// switch(expr){
		// case expr1:{
		// break;
		// }
		// case expr2:{
		// break;
		// }
		// default:
		// }

		int abc = 30;

		switch (abc) {

		case 1:
			System.out.println("One");
			System.out.println("number is one");
			break;
		case 2:
			System.out.println("Two");
			System.out.println("number is Two");
			break;
		case 3:
			System.out.println("Three");
			System.out.println("number is Three");
			break;
		case 4:
			System.out.println("Four");
			System.out.println("number is Four");
			break;
		case 5:
			System.out.println("Five");
			System.out.println("number is Five");
			break;

		default:
			System.out.println("wrong input");
		}

		System.out.println("END");

	}

}
