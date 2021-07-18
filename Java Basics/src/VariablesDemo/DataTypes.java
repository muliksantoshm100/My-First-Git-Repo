package VariablesDemo;

public class DataTypes {

	public static void main(String[] args) {

		//           size          limit
		byte b=20;//  1 byte     -128 to 127 
		System.out.println(b);
		short s=32767;// 2 byte   -32768 to 32767
		System.out.println(s);
		
		int i=2147483247; // 4 byte    -2147483247
		System.out.println(i);
		
		long mob=9874563210L;// 8 byte 
		System.out.println(mob);
		
		float f=20.30F; // 4 byte
		System.out.println(f);
		
		double d=25.30;// 8 byte
		System.out.println(d);
		
		char c='$'; // 2 byte
		System.out.println(c);
		
		boolean xyz=true;// 1 bit
		System.out.println(xyz);
		
		//non primitive data types
		
		String fname="Ramesh";
		System.out.println(fname);
		
		int arr[]= {10};
		System.out.println(arr[0]);
	}

}
