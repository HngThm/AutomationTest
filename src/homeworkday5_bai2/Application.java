package homeworkday5_bai2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luongCoBan = 10000000;
		TinhLuong luong = new TinhLuong();
		System.out.println("Lương 2 tham số = " + luong.tinhLuong(luongCoBan, 2));
		System.out.println("Lương 3 tham số = " + luong.tinhLuong(luongCoBan, 2, 4));
		System.out.println("Lương 4 tham số loại 1 = " + Double.valueOf(luong.tinhLuong(luongCoBan, 2, 4, 1)).longValue());
		System.out.println("Lương 4 tham số loại 2 = " + Double.valueOf(luong.tinhLuong(luongCoBan, 2, 4, 2)).longValue());
	}
}
