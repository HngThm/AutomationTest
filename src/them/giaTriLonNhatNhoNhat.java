package them;

import java.util.Scanner;

public class giaTriLonNhatNhoNhat {

	//– Nhập vào mảng 1 chiều số nguyên
	//– Tìm giá trị lớn nhất, nhỏ nhất
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nhập mảng
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i =0; i < n ; i++) {
			System.out.println("Giá trị các phần tử là: ");
			arr[i] = sc.nextInt();
		}
		//tìm giá trị lớn nhất, nhỏ nhất
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<n ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			else{
				min = arr[i];
			}
		}
		//in ra màn hình
		System.out.println("Giá trị lớn nhất: " + max);
		System.out.println("Giá trị nhỏ nhất: " + min);
	}

}
