package day4_encapsolution;

public class Person {
		public String name;
		private String phoneNumber;
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		//vì phoneNumber là biến private nên cần tạo phương thức Get để lấy thông tin và Set để nhập thông tin
		/*public String getphoneNumber()
		{
			return phonNumber;
		}
		
		public void getphoneNumber(String value)
		{
			this.phonNumber = value
		}*/
		
		
}
