package day5_inherritance;

public abstract class Nguoi {
	//Thuộc tính: hoTen, tuoi, ngaySinh -> tạo getter, setter
	//phương thức diChoi(){//trien khai code }
	private String hoTen;
	private int tuoi;
	private String ngaySinh;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public abstract void diChoi();
	

}
