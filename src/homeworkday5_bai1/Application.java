package homeworkday5_bai1;

import day5_thuchanh.HinhChuNhat;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HinhTron hinhtron1 = new HinhTron();
		hinhtron1.setTenHinh("Hình tròn");
		hinhtron1.setBanKinh(12);
		System.out.println("Tên hình là: " + hinhtron1.getTenHinh() + ", diện tích hình tròn = " + hinhtron1.tinhDienTich());
		
		HinhVuong hinhvuong1 = new HinhVuong();
		hinhvuong1.setTenHinh("Hình vuông");
		hinhvuong1.setChieuDaiMotCanh(15);
		System.out.println("Tên hình là: " + hinhvuong1.getTenHinh() + ", diện tích hình vuông = " + hinhvuong1.tinhDienTich());
	}

}
