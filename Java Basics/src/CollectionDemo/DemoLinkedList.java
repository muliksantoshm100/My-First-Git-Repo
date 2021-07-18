package CollectionDemo;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {

		// List list=new LinkedList();
		LinkedList list = new LinkedList();

		// works on index basics
		// can allow duplicates and null values
		// insertion order is preserved
		// liner list
		
		list.add("Java");
		list.add(10);
		list.add('A');
		list.add(10);
		list.add(null);

		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		System.out.println(list);
		
		list.remove(2);
		list.add(2,"Python");
		System.out.println(list);
		//LL is best choice for manupalation operation
		//LL is worst choice for retrieval	
	}
}
