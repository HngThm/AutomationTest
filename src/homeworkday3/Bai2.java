package homeworkday3;

import java.util.Scanner;

public class Bai2 {
	
	public static void nhapMang(int maxlength )
	{
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[maxlength];
		for (int i = 0; i < maxlength; i++) {
			System.out.println("Nhập giá trị mảng ở vị trí thứ: " + (i + 1) );
			arr[i] = sc.nextInt();
				if(arr[i] % 2 == 0 && arr[i] % 3 == 0) 
				{
					System.out.println("Điều kiện thoát xảy ra");
					return;
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhapMang(5);
	}

}
