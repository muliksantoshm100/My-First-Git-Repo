package Access_Modifier2;

import Access_Modifier.Sample1;

public class Sample4 {

	public static void main(String[] args) {
		Sample1 obj=new Sample1();
		System.out.println(obj.age);//public
		
		//System.out.println(obj.abc);//protected
		//System.out.println(obj.name);//default
		//System.out.println(obj.str);//private
	}

}
