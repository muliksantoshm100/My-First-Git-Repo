package ArrayDemo;

public class ArraySum {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
			sum+=arr[i];//0+10=10--10+20=30....
		}
		System.out.println(" = "+sum);
	}

}
