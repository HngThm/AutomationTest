package day3;

import java.util.Scanner;

public class ThucHanh_Return {

	public static int returnLargerNumber(int x, int y)
	
	{
		if(x>y) return x;
		else return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
			//inSoLonHon
			System.out.println("In ra số lớn hơn - Mời bạn nhập số thứ nhất");
			int x = sc.nextInt();
			System.out.println("In ra số lớn hơn - Mời bạn nhập số thứ hai");
			int y = sc.nextInt();
			returnLargerNumber(x, y);
			int result = returnLargerNumber(x, y);
			System.out.println("Số lớn hơn là: "+ result);
	}
}
