package ArrayDemo;

public class Demo1 {

	public static void main(String[] args) {

		int a = 10;

		// array collection of similar type of data
		// same type of data/ homogeneous data
		// fixed size
		// array work on index basics
		// array index starts form 0
		// last index is (size-1)

		int rollNo[] = new int[5];

		rollNo[0] = 10; // 1
		rollNo[1] = 20; // 2
		rollNo[2] = 30; // 3
		rollNo[3] = 40; // 4
		rollNo[4] = 50; // 5
		// rollNo[5]=60;

		System.out.println(rollNo.length);
		System.out.println(rollNo[0]);
		System.out.println(rollNo[2]);
		System.out.println(rollNo[4]);
		// System.out.println(rollNo[5]);

		// System.out.println(rollNo);
		System.out.println("+++++++++++++++++");
		for (int i = 0; i < rollNo.length; i++) {
			System.out.println(rollNo[i]);
		}

		int arr1[] = new int[5];
		int[] arr2 = new int[5];
		int arr3[] = { 10, 20, 30, 40 };
		int arr4[]=arr3;
		System.out.println(arr3.length);
		
		
		float []f=new float[5];
		f[1]=20.5f;
		
		System.out.println("Multi dimentional array");
		int multi[][]=new int[2][2];
		multi[0][0]=10;
		multi[0][1]=20;
		multi[1][0]=30;
		multi[1][1]=40;
		
		System.out.println(multi[0][0]);
		System.out.println(multi[1][0]);
		System.out.println("++++++++++++++++++");
		
		
		for(int i=0;i<multi.length;i++) {
			for(int j=0;j<multi[i].length;j++) {
				System.out.print(multi[i][j]+" ");//0,0--0,1 //1,0--1,1 
			}
			System.out.println();
		}
	}
}
