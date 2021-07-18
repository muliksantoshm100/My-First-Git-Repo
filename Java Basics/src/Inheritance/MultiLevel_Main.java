package Inheritance;
//MultiLevel Inheritance  
public class MultiLevel_Main {

	public static void main(String[] args) {

		Child_Multi c=new Child_Multi();
		
		System.out.println(c.age_child);
		System.out.println(c.age_Parent);
		System.out.println(c.age_Grand_Parent);
		c.m3_child();
		c.m2_parent();
		c.m1_Grand();
	
//		Parent_Multi p=new Parent_Multi();
//		p.m2_parent();
//		System.out.println(p.age_Parent);
//		System.out.println(p.age_Grand_Parent);
//		p.m1_Grand();
//		
//		GrandParent_Multi g=new GrandParent_Multi();
//		g.m1_Grand();
//		System.out.println(g.age_Grand_Parent);
	}
}
