package homeworkday5_bai3;

import java.util.Scanner;

public class BA extends Employee {

	private String levelBA;

	public String getLevelBA() {
		return levelBA;
	}

	public void setLevelBA(String levelBA) {
		this.levelBA = levelBA;
	}
 @Override
	public void nhapMang() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nhân viên BA");
		int n = sc.nextInt();
		sc.nextLine();
		// khởi tạo mảng dev
		BA[] arr = new BA[n];
		for (int i = 0; i < n; i++) {
			System.out.println("BA thứ " + (i + 1));
			// khởi tạo đối tượng dev
			BA ba1 = new BA();
			System.out.println("Nhập tên: ");
			ba1.setHoTen(sc.nextLine());
			System.out.println("Nhập mã nhân viên");
			ba1.setMaNV(sc.nextLine());
			System.out.println("Nhập số điện thoại");
			ba1.setSdt(sc.nextLine());
			System.out.println("Nhập level của BA");
			ba1.setLevelBA(sc.nextLine());
			arr[i] = ba1;
		}
		inMang(arr);
	}

	public void inMang(BA[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Thông tin nhân viên BA: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Tên: " + arr[i].getHoTen() + ", Mã nhân viên: " + arr[i].getMaNV() + ", Số điện thoại: "
					+ arr[i].getSdt() + ", Level: " + arr[i].getLevelBA());
		}

	}

}
