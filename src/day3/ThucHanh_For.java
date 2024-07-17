package day3;

import java.util.Scanner;

public class ThucHanh_For {

	public static void inCacSoChanNhoHon11()
	{
		for(int i = 0; i<= 10; i= i+2) // nếu if thì i++
		{
			//if (i % 2 == 0) 
				System.out.println("Giá trị của i là: " + i);
		}
	}
	
	public static void inCacSoChiaHetCho5()
	{
		for (int i=0; i <= 100; i++)
		{
			if (i%5==0)
				System.out.println("Các số chia hết cho 5 là: "+ i);
		}
	}
	
	public static void nhapMang(int maxlength )
	{
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[maxlength];
		for (int i = 0; i < maxlength; i++) {
			System.out.println("Nhập giá trị mảng ở vị trí thứ: " + (i + 1) );
			arr[i] = sc.nextInt();
		}
		inMang(arr);
		giaTriLonNhat(arr);
	}
	
	public static void inMang (int []mangSoNguyen)
	{
		System.out.println("Độ dài của mảng là: " + mangSoNguyen.length);
		System.out.println("Các phần tử của mảng là: ");
		for ( int i=0; i < mangSoNguyen.length; i++) {
			System.out.print(mangSoNguyen[i] + " ");
		}
	}
	
	public static void giaTriLonNhat (int []mangLonNhat)
	{
		int maxValue = 0;
		for(int i=0; i < mangLonNhat.length; i++) {
			if(maxValue < mangLonNhat[i]) {
				maxValue = mangLonNhat[i];
			}
		}
		System.out.println("Giá trị lớn nhất của mảng là: " + maxValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inCacSoChanNhoHon11();
		//inCacSoChiaHetCho5();
		nhapMang(10);
	}

}
