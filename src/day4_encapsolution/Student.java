package day4_encapsolution;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student1 = new Person();
		student1.name = "Nguyen Hong Tham";
		student1.setPhoneNumber("098766621");
		System.out.println("Họ tên: " + student1.name + ", Số điện thoại: " + student1.getPhoneNumber());
		
		Person student2 = new Person();
		student2.name = "Nguyen Hong A";
		System.out.println("Họ tên: " + student2.name + ", Số điện thoại: " + student2.getPhoneNumber());
	}

}
