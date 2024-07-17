package homeworkday3;

import java.util.Scanner;

public class Bai1 {
	
	public static void nhapMang(int maxlength )
	{
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[maxlength];
		for (int i = 0; i < maxlength; i++) {
			System.out.println("Nhập giá trị mảng ở vị trí thứ: " + (i + 1) );
			arr[i] = sc.nextInt();
		}
		sapXepMangGiamDan(arr);
	}
	
	public static void inMang (int []mangSoNguyen)
	{
		System.out.println("Độ dài của mảng là: " + mangSoNguyen.length);
		System.out.println("Các phần tử của mảng là: ");
		for ( int i=0; i < mangSoNguyen.length; i++) {
			System.out.print(mangSoNguyen[i] + " ");
		}
	}
	
	public static void sapXepMangGiamDan (int []mangSoNguyen) {
		int temp =0 ;
		for(int i = 0; i < mangSoNguyen.length; i++) {
			for (int j = i+1; j < mangSoNguyen.length; j++) {
				if(mangSoNguyen[i] < mangSoNguyen[j]) {
					temp = mangSoNguyen[i];
					mangSoNguyen[i] = mangSoNguyen[j];
					mangSoNguyen[j] =temp;
				}
			}
		}
		inMang(mangSoNguyen);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(10);
	}

}
