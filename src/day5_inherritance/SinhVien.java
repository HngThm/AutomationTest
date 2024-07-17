package day5_inherritance;

public class SinhVien extends Nguoi {
	//Thuộc tính: maSv, soTinChi
	//phương thức mở rộng: override diChoi()
	 //mở rộng phương thức diHoc()
	private String maSV;
	private int soTinChi;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	@Override
	public void diChoi() {
		// TODO Auto-generated method stub
		System.out.println("Sinh Viên đi chơi net");
	}
	
	public void diHoc() { 
		System.out.println("Sinh viên đi học" );
	}
	
	
}
