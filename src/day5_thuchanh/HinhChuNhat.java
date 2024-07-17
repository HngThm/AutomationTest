package day5_thuchanh;

public class HinhChuNhat extends HinhHoc {

	private int chieuDai;
	private int chieuRong;
	
	
	public int getChieuDai() {
		return chieuDai;
	}


	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}


	public int getChieuRong() {
		return chieuRong;
	}


	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}


	@Override
	public void tinhDienTich() {
		// TODO Auto-generated method stub
		System.out.println("Diện tích hình chữ nhật = " + chieuDai * chieuRong);
	}
	

}
