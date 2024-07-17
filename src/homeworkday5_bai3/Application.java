package homeworkday5_bai3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập phòng ban: ");
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			Dev nvDev = new Dev();
			nvDev.nhapMang();
			break;
		}
		case 2: {
			Tester nvTest = new Tester();
			nvTest.nhapMang();
			break;
		}
		case 3: {
			BA nvBA = new BA();
			nvBA.nhapMang();
			break;
		}
		default:
			System.out.println("Thông tin không hợp lệ");
			break;
		}
	}
}
