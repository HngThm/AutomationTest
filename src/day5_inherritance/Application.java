package day5_inherritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1 = new SinhVien();
		sv1.setHoTen("Nguyễn Văn A");
		sv1.setTuoi(22);
		sv1.setNgaySinh("01/01/2000");
		sv1.setMaSV("SV01");
		sv1.setSoTinChi(25);
		System.out.println("Sinh viên: " + sv1.getHoTen() +", " + sv1.getNgaySinh() +", " + sv1.getMaSV() +", " + sv1.getSoTinChi());
		sv1.diChoi();
		sv1.diHoc();
		System.out.println("=============");
		
		GiaoVien gv1 = new GiaoVien();
		gv1.setHoTen("Nguyễn Văn B");
		gv1.setNgaySinh("10/10/1990");
		gv1.setMaGV("GV01");
		gv1.setSoNamKN(5);
		System.out.println("Giáo viên: " + gv1.getHoTen()+ ", " + gv1.getNgaySinh() +", " + gv1.getMaGV() + ", " +gv1.getSoNamKN());
		gv1.diChoi();
		gv1.diDay();
	}

}
