package day2;

public class Person {
	public static int a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Họ và tên: Nguyễn Thị Hồng Thắm");
		System.out.println("Số điện thoại: 098989898");
		System.out.println("Email: abc@gmail.com");
		a=500;
		b=712;
		int result = a + b; //đặt breakpoint line 12
		System.out.println("a + b = "+ result);
		printLargerNumber();
	}
	public static void printLargerNumber () {
		if (a > b) {
			System.out.println("Số lớn hơn là: " + a);
		}else {
			System.out.println("Số lơn hơn là: " + b);
		}
	}
}
