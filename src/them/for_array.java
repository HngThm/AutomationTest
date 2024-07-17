package them;
import java.util.Scanner;

public class for_array {

//Cho một mảng các số nguyên n phần tử arr. Bạn hãy viết chương trình tính tổng các số lẻ lớn hơn 0 trong mảng.
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập n: ");
			int n = sc.nextInt();
	        int [] arr = new int[n];
	        for(int i = 0 ; i < n ; i++) {
	        	System.out.println("Nhập giá trị: ");
	            arr[i] = sc.nextInt();

	        }
	        int sum = 0;
	        for (int i = 0; i < n ; i++) {
	            if(arr[i] > 0 && arr[i] % 2 != 0) {
	                sum  += arr[i];
	            }
	        }
	        System.out.println("Tổng các số lẻ: " + sum);

	}
}
