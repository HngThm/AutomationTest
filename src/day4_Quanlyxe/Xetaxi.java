package day4_Quanlyxe;

public class Xetaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe taxi1 = new Xe();
		taxi1.setLoaiXe("Toyota");
		taxi1.setTenXe("Vios");
		taxi1.setVanTocMax(150);
		System.out.println(taxi1.getLoaiXe() + ", " + taxi1.getTenXe() + ", " + taxi1.getVanTocMax());
		
		Xe taxi2 = new Xe();
		taxi2.setLoaiXe("Toyota");
		taxi2.setTenXe("KIA");
		taxi2.setVanTocMax(250);
		System.out.println(taxi2.getLoaiXe() + ", " + taxi2.getTenXe() + ", " + taxi2.getVanTocMax());
	}

}
