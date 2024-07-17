package homeworkday5_bai2;

public class TinhLuong {
	
	public int tinhLuong (int luongCoBan, int heSoLuong) {
		return luongCoBan * heSoLuong;
	}

	public int tinhLuong (int luongCoBan, int heSoLuong, int soNamKN) {
		return luongCoBan * heSoLuong * soNamKN;
	}
	
	public double tinhLuong (int luongCoBan, int heSoLuong, int soNamKN, int loai) {
		if(loai == 1) {
			return luongCoBan * heSoLuong * soNamKN * 0.2;
		}
		else {
			return luongCoBan * heSoLuong * soNamKN * 0.45;
		}
	}
}
