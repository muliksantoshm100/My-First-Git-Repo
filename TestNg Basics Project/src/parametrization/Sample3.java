package parametrization;

import org.testng.annotations.Test;
import utils.DemoData;

public class Sample3 {

	@Test(dataProvider = "getData", dataProviderClass = DemoData.class)
	void validateData(String data) {

		System.out.println(data);

	}

	@Test(dataProvider = "getDataFromItr", dataProviderClass = DemoData.class)
	void validateDataFromItr(String name) {
		System.out.println(name);

	}

	@Test(dataProvider = "getDataFromMultiArr", dataProviderClass = DemoData.class)
	void validateDataFromMultiArr(String user, String pass) {
		System.out.println(user + " : " + pass);
	}

	@Test(dataProvider = "getDataFromItrObjArr", dataProviderClass = DemoData.class)
	void validateDataFromItrObjArr(String str1, String str2, String str3) {
		System.out.println(str1 + " | " + str1 + " | " + str1 + " |");
	}

}
