package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file=new FileInputStream("D:\\Test Data Lib\\Login-Test Data.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Login Data");
		
		//to get data in string-- getStringCellValue()
		String userName = sh.getRow(2).getCell(0).getStringCellValue();
		String pass =sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(userName+" "+ pass);
		
		//last row num
		System.out.println("last row num = "+sh.getLastRowNum());
		System.out.println("last cell num = "+ sh.getRow(1).getLastCellNum());
		
		//to get data in numeric-- getNumericCellValue()
		double pass1 =sh.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(pass1);
		
		
		boolean val = sh.getRow(3).getCell(1).getBooleanCellValue();
		System.out.println(val);
		
		CellType type = sh.getRow(3).getCell(1).getCellType();
		System.out.println(type);
		
	}

}
