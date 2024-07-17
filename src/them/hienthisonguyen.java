package them;

import java.util.Scanner;

public class hienthisonguyen {

	//Cho một mảng các số nguyên n phần tử arr. 
	//Bạn hãy viết chương trình hiển thị những số lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10 trong mảng arr.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0; i < n ; i++) {
			System.out.println("Nhập giá trị: ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Các số là: ");
		for(int i=0 ; i < n; i++) {
			if(arr[i] >= 0 && arr[i] <=10) {
				System.out.print(" " + arr[i]);
			}
		}
	}

}
