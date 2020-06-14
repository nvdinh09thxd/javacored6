package ex_tan.bt2;

import java.util.Scanner;

import ex_tan.exception.NumberException;

public class Bai2 {
	public static int[] Nhap(int[] arMang) {
		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		for (int i = 0; i < arMang.length; i++) {
			do {
				try {
					cont = false;
					System.out.println("Phần tử thứ " + (i + 1) + " là: ");
					arMang[i] = Integer.parseInt(sc.nextLine());
					if (arMang[i] <= 20 || arMang[i] >= 100) {
						throw new NumberException("Lỗi! Vui lòng nhập lại số từ 21 đến 99!!!");

					}
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}

			} while (cont);
		}
		return arMang;
	}

	public static void disPlay(int[] arMang) {
		System.out.println("======Mảng vừa nhập là=======");
		for (int so : arMang) {
			System.out.print(so + "\t");
		}
	}

	public static int chiaHet5(int[] arMang) {
		int dem5 = 0;
		for (int i = 0; i < arMang.length; i++) {
			if (arMang[i] % 5 == 0) {
				dem5++;
			}
		}
		return dem5;
	}

	public static int chiaHet3Va4(int[] arMang) {
		int dem34 = 0;
		for (int i = 0; i < arMang.length; i++) {
			if (arMang[i] % 3 == 0 && arMang[i] % 4 == 0) {
				dem34++;
			}
		}
		return dem34;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		int n = 0;
		do {
			try {
				System.out.println("Mời nhập số phẩn tử trong mảng : ");
				n = Integer.parseInt(sc.nextLine());
				if (n < 0) {
					throw new NumberException("vui lòng nhập số phần tử lớn hơn 0");
				}
				cont = false;
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("vui lòng nhập số nguyên ");
			} catch (NumberException e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);
		int[] arMang = new int[n];
		arMang = Nhap(arMang);
		disPlay(arMang);
		System.out.println("\ncó: " + chiaHet5(arMang) + " chia hết cho 5");
		System.out.println("có: " + chiaHet3Va4(arMang) + " chia hết cho 3 và 4");

	}
}
