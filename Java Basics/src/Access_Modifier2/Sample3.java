package Access_Modifier2;

import Access_Modifier.Sample1;

public class Sample3 extends Sample1 {

	public static void main(String[] args) {
		Sample1 obj=new Sample1();
		System.out.println(obj.age);//public
		
		Sample3 obj2=new Sample3();
		System.out.println(obj2.abc);//protected
		
		//System.out.println(obj.name);//default
		//System.out.println(obj.str);//private
	}

}
