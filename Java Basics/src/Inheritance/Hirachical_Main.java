package Inheritance;
//Hierarchical inheritance 
public class Hirachical_Main {

	public static void main(String[] args) {

		Son1 s1=new Son1();
		System.out.println(s1.age_Parent);
		System.out.println(s1.age);
		s1.home();
		s1.m1_son1();
		
		Son2 s2=new Son2();
		System.out.println(s2.age_Parent);
		System.out.println(s2.age);
		s2.home();
		s2.m2_son2();
		
	}

}
