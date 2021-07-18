package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {

		// SET
		// set does not allow duplicate values
		// only on null value can allow
		// no default capacity
		// does no work on index basics
		// works on hash-table

		// HashSet
		// not maintained the insertion order

		// HashSet hs=new HashSet();
		Set hs = new HashSet();

		hs.add("Java");
		hs.add(10);
		hs.add('A');
		hs.add(null);
		hs.add(10);
		hs.add(null);
		System.out.println(hs.size());
		System.out.println(hs);

		System.out.println(hs.isEmpty());
		System.out.println(hs.contains('A'));

		System.out.println("+++++++++++++++++");
		Iterator itr = hs.iterator();

		// itr.hasNext()+++++++++++
		// itr.next();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
