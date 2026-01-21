/**
 * 
 */
package lab1;

import java.util.Scanner;

public class Bai1_DTB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập họ và tên sinh viên: ");
		String hoTen = scanner.nextLine();
		
		System.out.print("Nhập điểm trung bình: ");
		double diemTB = scanner.nextDouble();
		
		System.out.printf("%s: %.1f điểm", hoTen, diemTB);
		
		scanner.close();
	}

}
