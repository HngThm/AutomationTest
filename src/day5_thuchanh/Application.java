package day5_thuchanh;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron hinhtron1 = new HinhTron();
		hinhtron1.setTenHinh("Hình tròn");
		hinhtron1.setBanKinh(12);
		hinhtron1.tinhDienTich();
		
		HinhChuNhat hinhchunhat1= new HinhChuNhat();
		hinhchunhat1.setTenHinh("Hình chữ nhật");
		hinhchunhat1.setChieuDai(24);
		hinhchunhat1.setChieuRong(43);
		hinhchunhat1.tinhDienTich();
	}

}
