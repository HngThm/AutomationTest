package homeworkday5_bai3;

import java.util.Scanner;

public class Dev extends Employee {

	private String levelDev;

	public String getLevelDev() {
		return levelDev;
	}

	public void setLevelDev(String levelDev) {
		this.levelDev = levelDev;
	}
 @Override
	public void nhapMang() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nhân viên Dev");
		int n = sc.nextInt();
		sc.nextLine();
		// khởi tạo mảng dev
		Dev[] arr = new Dev[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Dev thứ " + (i + 1));
			// khởi tạo đối tượng dev
			Dev dev1 = new Dev();
			System.out.println("Nhập tên: ");
			dev1.setHoTen(sc.nextLine());
			System.out.println("Nhập mã nhân viên");
			dev1.setMaNV(sc.nextLine());
			System.out.println("Nhập số điện thoại");
			dev1.setSdt(sc.nextLine());
			System.out.println("Nhập level của Dev");
			dev1.setLevelDev(sc.nextLine());
			arr[i] = dev1;
		}
		inMang(arr);
	}

	public void inMang(Dev[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Thông tin nhân viên dev: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Tên: " + arr[i].getHoTen() + ", Mã nhân viên: " + arr[i].getMaNV() + ", Số điện thoại: "
					+ arr[i].getSdt() + ", Level: " + arr[i].getLevelDev());
		}

	}

}
