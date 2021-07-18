package controlStatement;

public class ForDemo {

	public static void main(String[] args) {

		// for(initialization; condition ; increment/ decrement ){
		// for block
		// }

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("+++++++++");
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}
		
		
		int y=1;
		for(;y<=10;) {
			System.out.println(y);
			y++;
		}
		
//		for(;;) {
//			System.out.println(y++);
//		}
		
	}

}
