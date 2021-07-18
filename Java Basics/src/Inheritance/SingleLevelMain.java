package Inheritance;
//Single Level Inheritance 
public class SingleLevelMain {

	public static void main(String[] args) {

		Child c=new Child();
		System.out.println(c.age);//parent-- age
		System.out.println(c.childAge);//child--age
		c.bike();//child
		c.home();//parent
		c.car();//parent		
	}
}
