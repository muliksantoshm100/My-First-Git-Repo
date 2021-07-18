package utils;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

public class DemoData {
	
//	Object[] or Iterator<Object>
//	Object[][] or Iterator<Object[]>

	@DataProvider
	static Object[] getData() {
		Object[] obj= {"Java","Python","C++","JavaScript","SQL"};
		return obj;
	}
	
	@DataProvider
	static Iterator<Object> getDataFromItr() {
		ArrayList<Object> arrList=new ArrayList<Object>();
		arrList.add("Sagar");
		arrList.add("Ramesh");
		arrList.add("Suresh");
		arrList.add("Mahesh");
		
		return arrList.iterator();
	}
	
	@DataProvider
	static Object[][] getDataFromMultiArr() {
		
		Object[][] obj= {
				{"USER101","Pass@101"},
				{"USER102","Pass@102"},
				{"USER103","Pass@103"},
				{"USER104","Pass@104"}
		                 };
		return obj;
	}
	
	@DataProvider
	static Iterator<Object[]> getDataFromItrObjArr() {
		
		ArrayList<Object []> arr=new ArrayList<Object []>();
		Object[] obj1= {"Java","C++","Python"};
		Object[] obj2= {"Maths","Chem","Physics"};
		Object[] obj3= {"BCA","MCA","B-Tech"};
		Object[] obj4= {"Ram","Sham","Mohan"};
		
		arr.add(obj1);
		arr.add(obj2);
		arr.add(obj3);
		arr.add(obj4);
		
		return arr.iterator();
	}
	
	
	public static void main(String[] args) {
//		Object[] arr = getData();
//		for(Object obj:arr) {
//			System.out.println(obj.toString());
//		}
		
//		Iterator<Object> itr = getDataFromItr();
//		while(itr.hasNext()) {
//			System.out.println(itr.next().toString());
//		}
		
//		Object[][] arr = getDataFromMultiArr();
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Iterator<Object[]> itr = getDataFromItrObjArr();
		while(itr.hasNext()) {
			Object[] obj = itr.next();
			for(int i=0;i<obj.length;i++) {
				System.out.print(obj[i]+" | ");
			}
			System.out.println();
		}
	}

}
