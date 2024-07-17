package day5_thuchanh2;

public class Application {
	
	public static void main(String[] args) {
		int luongCoBan = 10000000;
		// TODO Auto-generated method stub
		TinhLuong test = new TinhLuong();
		System.out.println(test.tinhLuong(luongCoBan, 2));
		System.out.println(test.tinhLuong(luongCoBan, 3, 4));
		System.out.println(test.tinhLuong(luongCoBan, 3, 4, 1));
		System.out.println(test.tinhLuong(luongCoBan, 3, 4, 2));
	}

}
