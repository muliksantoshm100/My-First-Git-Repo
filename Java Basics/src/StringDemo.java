
public class StringDemo {

	public static void main(String[] args) {

		
		//Lateral
		String s1="welcome";
		String s2="welcome";
		
		//by using new keyword
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		//to compare equality of two string 
		//== operator
		   //check the memory allocation is equal or not
		// .equals()
			//verify Content of the strings 
		
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s3==s4);//false
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s3.equals(s4));//true
		
	}

}
