package controlStatement;

public class DoWhileDemo {

	public static void main(String[] args) {

//		do {
//			do block
//		}while(condition);
		
		int i=1;
		
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println("+++++++++++++++");
		
		int y=10;
		do {
			System.out.println(y);
			y--;
		}while(y>=1);
	}

}
