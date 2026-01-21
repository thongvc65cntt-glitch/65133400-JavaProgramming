package lab1;
import java.util.Scanner;

public class Bai2_ChuviDT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài cạnh thứ nhất: ");
		double canh1 = scanner.nextDouble();
		
		System.out.print("Nhập chiều rộng cạnh thứ hai: ");
		double canh2 = scanner.nextDouble();

		double chuVi = (canh1 + canh2) * 2;
		double dienTich = canh1 * canh2;
		
		double canhNhoNhat = Math.min(canh1, canh2); //Hàm Math.min(). Dùng để so sánh 2 số và trả về số nhỏ hơn
		
		System.out.println("Kết quả");
		System.out.printf("Chu vi hình chữ nhật: %.2f", chuVi);
		System.out.printf("\nDiện tích hình chữ nhật: %.2f", dienTich);
		System.out.printf("\nCạnh nhỏ nhất: %.2f", canhNhoNhat);
		
		scanner.close();
	}

}
