package lab1;
import java.util.Scanner;
public class Bai4_Delta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Chương trình tính Delta phương trình bậc 2 (ax^2 + bx + c = 0)");
		
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();

		double delta = Math.pow(b, 2) - 4* a * c;
		
		double canDelta = Math.sqrt(delta); //Hàm Math.sqrt() để tính căn của một số
		
		System.out.println("Kết quả");
		System.out.printf("Delta: %.2f", delta);
		System.out.printf("\nCăn Delta: %.2f", canDelta);
		
		scanner.close();
	}

}
