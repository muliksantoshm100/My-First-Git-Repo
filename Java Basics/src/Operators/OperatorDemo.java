package Operators;

public class OperatorDemo {

	public static void main(String[] args) {

		// Arithmetic operator (+,-,/,*,%)
		int a = 20;
		int b = 30;
		System.out.println(a + b);// 50
		System.out.println(b - a);// 10
		System.out.println(a / 2);// 10
		System.out.println(a * 2);// 40
		System.out.println(a % 3);// 2
		// Unary
		// Increment (++)
		// prifix postfix
		// ++expr expr++
		// =======>>>>>>>>>>
		System.out.println(a++);// 20
		System.out.println(a);// 21
		// ====>>>>>>>>
		System.out.println(++b);// 31
		// Decrement (--)
		// prifix postfix
		// --expr expr--
		a = 10;
		b = 20;
		System.out.println(a--);// 10
		System.out.println(a);// 9
		System.out.println(--b);// 19
		// Relational
		// <, >, <=, >=, == , !=
		a = 10;
		b = 20;
		System.out.println(a < b);// true
		System.out.println(a > b);// false
		System.out.println(b > a);// true
		int c = 10;

		System.out.println(a <= c);// true
		System.out.println(a >= c);// true
		System.out.println(a == c);// true
		System.out.println(a != b);// true
		a = 10;
		b = 20;
		c = 10;
		// Bitwise
		// & , |
		// true & true == true
		// false & false == false
		// false & true == false
		// true & false == false
		System.out.println((a > b) & (a > c));// false
		System.out.println((a < b) & (a == c));// true
		System.out.println((a > b) & (a == c));// false
		// |
		// true | true == true
		// false | false == false
		// false | true == true
		// true | false == true
		System.out.println((a > b) | (a == c));// true
		System.out.println((a > b) | (a != c));// false

		// && , ||
		System.out.println((a > b) && (a > c));// false
		System.out.println((a < b) || (a >= c));// true
		a = 100;
		b = 20;
		// ternary operator
		// (expr)? true:false
		String result = (a > b) ? "a is graeter" : "b is grater";
		System.out.println(result);

		// assignment operator

		// =, +=,-=,*=,/=, %=

		// <<<<
		int x = 20;
		// <<<<
		int y = 20 + 30;
		System.out.println(y);
		x = 30;
		System.out.println(x);
		// x=x+y;
		x += y;
		System.out.println(x);
		// x=x-20;
		x -= 20;
		System.out.println(x);
        //y=y/5;
		y /= 5;
		System.out.println(y);
		
		y*=2;
		System.out.println(y);
	}

}
