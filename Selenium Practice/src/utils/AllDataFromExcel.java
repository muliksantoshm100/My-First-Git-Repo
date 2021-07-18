package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AllDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("D:\\Test Data Lib\\Login-Test Data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Login Data");
		
		for(int i=1;i<=sh.getLastRowNum();i++) {
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++) {
				
				String type = sh.getRow(i).getCell(j).getCellType().toString();
				String data=null;
				
				if(type.equals("STRING")) {
					data=sh.getRow(i).getCell(j).getStringCellValue();
				}else if(type.equals("NUMERIC")) {
					data=sh.getRow(i).getCell(j).getNumericCellValue()+" ";
				}else if(type.equals("BOOLEAN")) {
					data=sh.getRow(i).getCell(j).getBooleanCellValue()+" ";
				}
				
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

}
