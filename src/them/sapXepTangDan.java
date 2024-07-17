package them;

import java.util.Scanner;

public class sapXepTangDan {
	//Cho một mảng các số nguyên n phần tử arr. 
	//Bạn hãy viết chương trình sắp xếp các phần tử của mảng theo thứ tự tăng dần và hiển thị ra màn hình mảng sau khi đã sắp xếp.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nhập mảng
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0 ; i < n ; i++) {
			System.out.println("Các phần tử n là: ");;
			arr[i] = sc.nextInt();
		}
		//sắp xếp tăng dần
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for(int j = i +1; j < n; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		//in ra màn hình
		System.out.print("Thứ tự tăng dần là: ");
		for(int i = 0; i< n; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
