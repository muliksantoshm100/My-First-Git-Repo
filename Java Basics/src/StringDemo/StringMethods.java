package StringDemo;

public class StringMethods {

	public static void main(String[] args) {

		
		String s1="Python";
		String s2="";
		String s3="welcome";
		String s4="WELCOME";
		
		String s5="I am learning java program";
		String s6="     ";
		
		//length();
		System.out.println(s1.length());
		int len = s5.length();
		System.out.println(len);
		
		//charAt()
		char c = s1.charAt(2);
		System.out.println(c);
		System.out.println(s5.charAt(20));
		
		System.out.println("indexOf('')");
		//indexOf('')
		int i = s1.indexOf('o');
		System.out.println(i);
		System.out.println(s5.indexOf('j'));
		System.out.println("index of 'e'  in welcome="+s3.indexOf('e'));
		
		//lastIndexOf()
		System.out.println();
		System.out.println("last index of 'e'  in welcome="+s3.lastIndexOf('e'));
		System.out.println(s5.lastIndexOf('a'));
		//+
		//concat()
		
		System.out.println(s1+" "+s3);
		System.out.println(s1.concat(s4));
		
		//isEmpty()
		
		System.out.println(s1.isEmpty());//false
		System.out.println(s2.isEmpty());//true
		System.out.println(s6.isEmpty());//false
		
		//isBlanck()
		
		System.out.println(s1.isBlank());//false
		System.out.println(s2.isBlank());//true
		System.out.println(s6.isBlank());//true
		
		//toUpperCase()
		System.out.println(s3.toUpperCase());
		System.out.println(s1.toUpperCase());
		
		
		//toLowerCase()
		System.out.println(s4.toLowerCase());
		System.out.println(s1.toLowerCase());
		
		//split()
		
		String[] allWords = s5.split(" ");
		System.out.println(allWords.length);
		
		for(int n=0;n<allWords.length;n++) {
			System.out.println(allWords[n]);
		}
		
		//trim()
		String s7="   Ram    ";
		System.out.println(s7 +"-"+ s7.length());
		String s8=s7.trim();
		System.out.println(s8+"-"+s8.length());
		
		 s3="welcome";
		 s4="Welcome";
		//.equalsIgnoreCase
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
	}

}
