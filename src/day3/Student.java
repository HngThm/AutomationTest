package day3;

import java.util.Scanner;

public class Student {

	public static String result;
	public static void inSoLonHon (double st1, double st2)
	{
		result = (st1 > st2) ? "Số lớn hơn là: " +st1 : "Số lớn hơn là: " +st2;
		System.out.println(result);
	}
	public static void kiemTraChanLe (int st3)
	{
		result = (st3 % 2 == 0) ? "Số vừa nhập là số chẵn" : "Số vừa nhập là số lẻ";
		System.out.println(result);
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			//inSoLonHon
			System.out.println("In ra số lớn hơn - Mời bạn nhập số thứ nhất");
			double st1 = sc.nextDouble();
			System.out.println("In ra số lớn hơn - Mời bạn nhập số thứ hai");
			double st2 = sc.nextDouble();
			inSoLonHon(st1, st2);
			//kiemTraChanLe
			System.out.println("Kiểm tra số chẵn lẻ - Mời bạn nhập số cần kiểm tra");
			int st3 = sc.nextInt();
			kiemTraChanLe(st3);
		}
	}
}
