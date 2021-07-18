package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		//List arrList=new ArrayList();
		ArrayList arr=new ArrayList();
		
		//works on index basics
		//can allow duplicates and null values
		//insertion order is preserved
		//dynamic array
		
		arr.add("Java");
		arr.add(10);
		arr.add(true);
		arr.add('A');
		arr.add(10);
		arr.add(null);
		
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		System.out.println(arr.get(3));
		arr.remove(0);
		arr.add(2,"Python");
		System.out.println(arr);
		
		//arrayList is best choice for retrieval operation
		//- ArrayList is work on index basics
		//- ArrayListis implemented by random access interface
		//Incremental size of AL=current_cpicity*3/2+1=10*3/2+1=16
		
		//AL is worst choice for manipulation operation
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}	
	}

}
