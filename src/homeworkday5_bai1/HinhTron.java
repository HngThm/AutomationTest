package homeworkday5_bai1;

public class HinhTron extends HinhHoc {

		private int banKinh;

		public int getBanKinh() {
			return banKinh;
		}

		public void setBanKinh(int banKinh) {
			this.banKinh = banKinh;
		}

		@Override
		public double tinhDienTich() {
			// TODO Auto-generated method stub
			return (2 * 3.14 * banKinh);
		}
		
		
		
		
}
