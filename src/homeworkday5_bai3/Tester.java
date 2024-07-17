package homeworkday5_bai3;

import java.util.Scanner;

public class Tester extends Employee {
	private String levelTest;

	public String getLevelTest() {
		return levelTest;
	}

	public void setLevelTest(String levelTest) {
		this.levelTest = levelTest;
	}
 @Override
	public void nhapMang() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nhân viên Test");
		int n = sc.nextInt();
		sc.nextLine();
		// khởi tạo mảng dev
		Tester[] arr = new Tester[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Test thứ " + (i + 1));
			// khởi tạo đối tượng dev
			Tester test1 = new Tester();
			System.out.println("Nhập tên: ");
			test1.setHoTen(sc.nextLine());
			System.out.println("Nhập mã nhân viên");
			test1.setMaNV(sc.nextLine());
			System.out.println("Nhập số điện thoại");
			test1.setSdt(sc.nextLine());
			System.out.println("Nhập level của Test");
			test1.setLevelTest(sc.nextLine());
			arr[i] = test1;
		}
		inMang(arr);
	}

	public void inMang(Tester[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Thông tin nhân viên test: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Tên: " + arr[i].getHoTen() + ", Mã nhân viên: " + arr[i].getMaNV() + ", Số điện thoại: "
					+ arr[i].getSdt() + ", Level: " + arr[i].getLevelTest());
		}

	}
}
