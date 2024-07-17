package day5_thuchanh;

public class HinhTron extends HinhHoc{

	private int banKinh;
	
	public int getBanKinh() {
		return banKinh;
	}


	public void setBanKinh(int banKinh) {
		this.banKinh = banKinh;
	}


	@Override
	public void tinhDienTich() {
		// TODO Auto-generated method stub
		System.out.println("Diện tích hình tròn = " + ( 3.14 * banKinh * banKinh));
	}


}
