package Access_Modifier;

public class Sample1 {
	
	public int age=20;
	
	protected int abc=30;
	
	String name="Java";// default String name="Java";
	
	private String str="welcom";
	
	protected String empID="USER001";
	public static void main(String[] args) {
		
		Sample1 obj=new Sample1();
		System.out.println(obj.age);
		
		System.out.println(obj.abc);//protected
		System.out.println(obj.name);//default
		System.out.println(obj.str);//private
		
	}
}
