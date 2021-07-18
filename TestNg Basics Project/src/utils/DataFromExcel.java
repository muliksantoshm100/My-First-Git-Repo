package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataFromExcel {

	@DataProvider
	static Iterator<Object[]> getDataFromExel() throws IOException {

		FileInputStream file = new FileInputStream("D:\\selenium files\\TestData.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("LoginData");

		ArrayList<Object[]> arr = new ArrayList<Object[]>();

		for (int i = 1; i <= sh.getLastRowNum(); i++) {

			Object[] obj = new Object[sh.getRow(i).getLastCellNum()];

			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {

				String type = sh.getRow(i).getCell(j).getCellType().toString();
				String str = "";

				if (type.equals("STRING")) {
					str = sh.getRow(i).getCell(j).getStringCellValue();
					obj[j] = str;
				} else if (type.equals("NUMERIC")) {
					str = sh.getRow(i).getCell(j).getNumericCellValue() + "";
					obj[j] = str;
				}
			}

			arr.add(obj);
		}

		return arr.iterator();
	}

	public static void main(String[] args) throws IOException {

		Iterator<Object[]> itr = getDataFromExel();

		while (itr.hasNext()) {
			Object[] obj = itr.next();
			for (int i = 0; i < obj.length; i++) {
				System.out.print(obj[i]+" ");
			}
			System.out.println();
		}
	}

}
