package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {

	public static void main(String[] args) {

		// maintained insertion order
		Set lhs = new LinkedHashSet();
		// LinkedHashSet lhs1=new LinkedHashSet<E>();

		lhs.add("Java");
		lhs.add(10);
		lhs.add('A');
		lhs.add(null);
		lhs.add(10);
		lhs.add(null);

		System.out.println(lhs);
		Iterator itr = lhs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
