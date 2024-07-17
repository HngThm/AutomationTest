package day5_overloading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhTong test = new TinhTong();
		System.out.println(test.add(23, 1234));
		System.out.println(test.add(12.2, 432.3));
		System.out.println(test.add("Chuỗi 1 ", "Chuỗi 2"));
		
	}

}
