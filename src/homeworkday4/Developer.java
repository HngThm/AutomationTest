package homeworkday4;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Dev1 =new Employee();
		Dev1.setEmployee_id("01");
		Dev1.setEmployee_name("Nguyễn Thị Hồng Thắm");
		System.out.println("ID: " + Dev1.getEmployee_id() + ", Họ tên: " + Dev1.getEmployee_name() + ", Lương: " + Dev1.getEmployee_salary());
		
		Employee Dev2 =new Employee();
		Dev2.setEmployee_id("02");
		Dev2.setEmployee_name("Nguyễn Văn B");
		System.out.println("ID: " + Dev2.getEmployee_id() + ", Họ tên: " + Dev2.getEmployee_name() + ", Lương: " + Dev2.getEmployee_salary());
	}
	//Với thuộc tính Salary không khai báo phương thức setter nên khi thực hiện lấy thông tin getEmployee_salary mặc định giá trị = 0 (salary kiểu dữ liệu là int)
}
