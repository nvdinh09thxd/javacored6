package ex_dung;

import java.util.Scanner;

import ex_dung.NumberException;;

public class Bai2 {

	// Nhập các phần tử trong mảng
	public static void input(int[] arrNumber) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập phần tử trong mảng(n > 20 và n < 100)");
		for (int i = 0; i < arrNumber.length; i++) {
			boolean cont = false;
			do {
				try {
					System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
					arrNumber[i] = Integer.parseInt(input.nextLine());
					if (arrNumber[i] <= 20 || arrNumber[i] >= 100) {
						throw new NumberException("Vui lòng nhập số > 20 và < 100");
					}
					cont = false;
				} catch (NumberFormatException e) {
					cont = true;
					System.out.println("Vui lòng nhập vào là số nguyên");
				} catch (NumberException e) {
					cont = true;
					System.out.println(e.getMessage());
				}
			} while (cont);
		}
	}

	// Đếm số chia hết cho 5
	public static int demSoChiaHetCho5(int[] arNumber) {
		int dem = 0;
		for (int num : arNumber) {
			if (num % 5 == 0) {
				dem++;
			}
		}
		return dem;
	}

	// Đếm số vừa chia hết cho 3, vừa chia hết cho 4
	public static int demSoChiaHetCho3Va4(int[] arNumber) {
		int dem = 0;
		for (int num : arNumber) {
			if (num % 3 == 0 && num % 4 == 0) {
				dem++;
			}
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		boolean cont = false;
		do {
			try {
				System.out.print("Nhập số lượng phần tử trong mảng: ");
				n = Integer.parseInt(input.nextLine());
				if (n < 0) {
					throw new NegativeArraySizeException("Vui lòng nhập vào số lượng phần tử >= 0");
				}
				cont = false;
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("Vui lòng nhập vào là số nguyên");
			} catch (NegativeArraySizeException e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);
		int[] arNumber = new int[n];
		input(arNumber);
		System.out.println("======== Phần tử trong mảng ========");
		for (int num : arNumber) {
			System.out.print(num + " ");
		}
		System.out.println("\nTrong mảng có " + demSoChiaHetCho5(arNumber) + " số chia hết cho 5");
		System.out.println(
				"Trong mảng có " + demSoChiaHetCho3Va4(arNumber) + " số vừa chia hết cho 3, vừa chia hết cho 4");

	}

}
