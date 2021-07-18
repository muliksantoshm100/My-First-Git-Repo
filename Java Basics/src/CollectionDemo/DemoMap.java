package CollectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();

		// key can not be duplicate

		// ABC=10
		m.put("ABC", 10);
		m.put("DEF", 20);
		m.put("GHI", 10);
		m.put("ABC", 40);
		m.put(null, 50);

		System.out.println(m.get("DEF"));

		System.out.println("+++++++++++++++++");

		Set<Entry<String, Integer>> all = m.entrySet();
		for (Map.Entry<String, Integer> e : all) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
	}

}
