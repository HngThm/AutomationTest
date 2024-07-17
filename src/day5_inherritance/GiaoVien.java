package day5_inherritance;

public class GiaoVien extends Nguoi{
	//Thuộc tính: maGV, soNamKN
	//phương thức mở rộng: override diChoi()
	 //mở rộng phương thức diDay()
	private String maGV;
	private int soNamKN;
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public int getSoNamKN() {
		return soNamKN;
	}
	public void setSoNamKN(int soNamKN) {
		this.soNamKN = soNamKN;
	}
	@Override
	public void diChoi() {
		// TODO Auto-generated method stub
		System.out.println("Giáo viên đi du lich");
	}
	
	public void diDay() {
		System.out.println("Giáo viên đi dạy học");
	}

}
