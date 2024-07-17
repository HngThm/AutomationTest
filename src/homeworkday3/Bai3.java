package homeworkday3;

import java.util.Scanner;

public class Bai3 {
	public static void nhapMang(int maxlength )
	{
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[maxlength];
		for (int i = 0; i < maxlength; i++) {
			System.out.println("Nhập giá trị mảng ở vị trí thứ: " + (i + 1) );
			arr[i] = sc.nextInt();
		}
		inMang(arr);
		giaTriNhoNhat(arr);
	}
	
	public static void inMang (int []mangSoNguyen)
	{
		System.out.println("Độ dài của mảng là: " + mangSoNguyen.length);
		System.out.println("Các phần tử của mảng là: ");
		for ( int i=0; i < mangSoNguyen.length; i++) {
			System.out.print(mangSoNguyen[i] + " ");
		}
	}
	
	public static void giaTriNhoNhat (int []mangNhoNhat)
	{
		int minValue = mangNhoNhat[0];
		for(int i=0; i < mangNhoNhat.length; i++) {
			if(minValue > mangNhoNhat[i]) {
				minValue = mangNhoNhat[i];
			}
		}
		System.out.println("Giá trị nhỏ nhất của mảng là: " + minValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(10);
	}
}
