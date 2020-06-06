package ex_tan;

import java.util.Scanner;

public class Bai2 {
	public int[] Nhap(int n) {
		int[] arMang = new int[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arMang.length; i++) {
			boolean cont = false;
			do {
				cont = false;
				int so = Integer.parseInt(sc.nextLine());
				if (so <= 20 || so >= 100) {
					System.out.println("Lỗi! Vui lòng nhập lại !!!");
					cont = true;
				}
				arMang[i] = so;
			} while (cont);
		}
		return arMang;
	}

	public void disPlay(int[] arMang) {
		System.out.println("======Mảng vừa nhập là=======");
		for (int i = 0; i < arMang.length; i++) {
			System.out.println(arMang[i]);
		}
	}

	public int chiaHet5(int[] arMang) {
		int dem5 = 0;
		for (int i = 0; i < arMang.length; i++) {
			if (arMang[i] % 5 == 0) {
				dem5++;
			}
		}
		return dem5;
	}

	public int chiaHet3Va4(int[] arMang) {
		int dem34 = 0;
		for (int i = 0; i < arMang.length; i++) {
			if (arMang[i] % 3 == 0 && arMang[i] % 4 == 0) {
				dem34++;
			}
		}
		return dem34;
	}

	public static void main(String[] args) {
		Bai2 objBai2 = new Bai2();
		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		do {
			try {
				System.out.println("Mời nhập số phẩn tử trong mảng : ");
				int n = Integer.parseInt(sc.nextLine());
				if (n < 0) {
					throw new Exception("vui lòng nhập số phần tử lớn hơn 0");
				}
				cont = false;
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("vui lòng nhập số nguyên ");
			} catch (Exception e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);
		int n = Integer.parseInt(sc.nextLine());
		int[] arMang = objBai2.Nhap(n);
		objBai2.disPlay(arMang);
		System.out.println("có: " + objBai2.chiaHet5(arMang) + " chia hết cho 5");
		System.out.println("có: " + objBai2.chiaHet3Va4(arMang) + " chia hết cho 3 và 4");

	}
}
