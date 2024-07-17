package day4;

public class Motobike_Object {

	static String hangXe;
	static String mauXe;
	static String bienSoXe;
	static String ngayDangKy;
	
	public static String getInformation() {
		return ("Hang xe là: " + hangXe + ", mau xe: " +mauXe + ", bien so xe: " + bienSoXe + ", ngay dang ky: "+ ngayDangKy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motobike_Object xe1 = new Motobike_Object();
		xe1.hangXe = "Lead";
		xe1.mauXe = "Xam";
		xe1.bienSoXe = "29S1-123456";
		xe1.ngayDangKy = "10/10/2022";
		System.out.println(xe1.getInformation());
		
		Motobike_Object xe2 = new Motobike_Object();
		xe2.hangXe = "Vision";
		xe2.mauXe = "Red";
		xe2.bienSoXe = "30S1-123456";
		xe2.ngayDangKy = "10/10/2024";
		System.out.println(xe2.getInformation());
	}

}
