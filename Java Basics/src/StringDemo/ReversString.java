package StringDemo;

public class ReversString {

	public static void main(String[] args) {

		String str = "I am lerning java program";
		//			 "I ma  gninrel avaj margorp";
		System.out.println(str);

		String rev = "";
		System.out.println(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
