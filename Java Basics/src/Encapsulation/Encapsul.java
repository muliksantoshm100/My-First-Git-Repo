package Encapsulation;

public class Encapsul {

	public static void main(String[] args) {
     Demo obj=new Demo();
     System.out.println(obj.getName());
     obj.setAge(20);
     obj.setName("User Data--python");
     
     System.out.println(obj.getAge());
     System.out.println(obj.getName());
	}

}
