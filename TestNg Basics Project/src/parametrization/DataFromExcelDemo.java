package parametrization;

import org.testng.annotations.Test;

import utils.DataFromExcel;

public class DataFromExcelDemo {

	@Test(dataProvider = "getDataFromExel", dataProviderClass = DataFromExcel.class)
	void validateDataFromExcel(String user, String pass) {
		System.out.println(user+" "+pass);
	}
}
