package homeworkday5_bai3;

public abstract class Employee {
	
	private String hoTen;
	private String maNV;
	private String sdt;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public abstract void nhapMang();
}
