package CollectionDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {

		Set<String> tree = new TreeSet<String>();

		tree.add("Java");
		tree.add("Python");
		tree.add("C++");
		// tree.add(null);
		tree.add("Java");
		// tree.add(null);

		System.out.println(tree);

		Iterator<String> itr = tree.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("+++++++++++++++");

		// for(DataType var: collectionObj)
		for (String str : tree) {
			System.out.println(str);
		}

	}

}
