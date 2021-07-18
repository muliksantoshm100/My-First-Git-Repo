package ArrayDemo;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int arr[] = { 10, 5, 40, 20, 1 };

		System.out.println("Before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//1 way
		//Arrays.sort(arr);
		
		// 2 way
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
