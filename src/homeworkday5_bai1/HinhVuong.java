package homeworkday5_bai1;

public class HinhVuong extends HinhHoc {
	
	private int chieuDaiMotCanh;

	public int getChieuDaiMotCanh() {
		return chieuDaiMotCanh;
	}



	public void setChieuDaiMotCanh(int chieuDaiMotCanh) {
		this.chieuDaiMotCanh = chieuDaiMotCanh;
	}
	
	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return (chieuDaiMotCanh * 4);
	}
}
