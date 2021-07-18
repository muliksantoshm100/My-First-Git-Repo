package controlStatement;

public class BreakAndContinue {

	public static void main(String[] args) {

		//break== to stop the loop
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		System.out.println("++++++++++++");
		
		for(int j=1;j<=10;j++) {
			
			if(j<=5) {
				System.out.println();
				continue;
			}
			System.out.println(j);
		}
		
		System.out.println("END");
		
	}

}
