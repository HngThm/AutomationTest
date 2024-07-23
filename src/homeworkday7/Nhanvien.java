package homeworkday7;

import java.util.Scanner;

public class Nhanvien {

  private String hoTen;

public String getHoTen() {
	return hoTen;
}

public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
  
public static void main(String[] args) {
	nhapMang();
}
public static void nhapMang() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập số nhân viên");
	int n =sc.nextInt();
	sc.nextLine();
	Nhanvien [] arr = new Nhanvien[n];
	for(int i=0; i< n; i++) {
		System.out.println("Nhập tên nhân viên " + (i+1));
		Nhanvien nv1 = new Nhanvien();
		nv1.setHoTen(sc.nextLine());
		arr[i]= nv1;
	}
	inMang(arr);
}
  public static void inMang(Nhanvien []arr) {
	  System.out.println("Danh sách tên nhân viên là: ");
	  for(int i =0; i< arr.length; i++) {
		  System.out.println("Tên nhân viên thứ " + (i+1) + " :" + arr[i].getHoTen());
	  }
  }
	
}


