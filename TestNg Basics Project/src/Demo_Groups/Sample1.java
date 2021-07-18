package Demo_Groups;

import org.testng.annotations.Test;

public class Sample1 {

	@Test(groups = {"sanity"})
	void test1() {
		System.out.println("test 1 : sanity");
	}

	@Test(groups = {"regrassion"})
	void test2() {
		System.out.println("test 2 : regrassion");
	}

	@Test(groups = {"sanity", "regrassion"})
	void test3() {
		System.out.println("test 3 : sanity / regrassion");
	}

}
