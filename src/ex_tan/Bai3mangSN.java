package ex_tan;

import java.util.Scanner;

public class Bai3mangSN {
	public int[] Nhap(int m) {
		int[] arSoNguyen = new int[m];
		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		for (int i = 0; i < arSoNguyen.length; i++) {

			do {
				cont = false;
				System.out.println("Nhập phần tử thứ " + (i + 1) + " là:");
				int so = Integer.parseInt(sc.nextLine());
				if (so <= -100) {
					System.out.println("Lỗi! vui lòng nhập lại!!!");
					cont = true;
				}
				arSoNguyen[i] = so;
			} while (cont);

		}

		return arSoNguyen;
	}

	public void displayData(int[] arSoNguyen) {
		System.out.println("---Mảng Số Nguyên---");
		for (int i = 0; i < arSoNguyen.length; i++) {
			System.out.print(arSoNguyen[i] + "\t");
		}
	}

	public int tong(int[] arSoNguyen) {
		int sum = 0;
		for (int i = 0; i < arSoNguyen.length; i++) {
			sum += arSoNguyen[i];
		}
		return sum;
	}

	public int tongDuong(int[] arSoNguyen) {
		int sumDuong = 0, dem = 0;

		for (int i = 0; i < arSoNguyen.length; i++) {
			if (arSoNguyen[i] > 0) {
				sumDuong += arSoNguyen[i];
				dem++;
			}
		}
		System.out.println("Tổng số dương có " + dem + " số");
		return sumDuong;
	}

	public int tongAm(int[] arSoNguyen) {
		int sumAm = 0, dem = 0;
		for (int i = 0; i < arSoNguyen.length; i++) {
			if (arSoNguyen[i] < 0) {
				sumAm += arSoNguyen[i];
				dem++;
			}
		}
		System.out.println("Tổng số âm có " + dem + " số");
		return sumAm;
	}

	public float tbinhDuong(int[] arSoNguyen) {
		float avgD;
		int dem = 0;
		Bai3mangSN objBai3 = new Bai3mangSN();

		for (int i = 0; i < arSoNguyen.length; i++) {
			if (arSoNguyen[i] > 0) {

				dem++;
			}
		}
		avgD = objBai3.tongDuong(arSoNguyen) / dem;
		return avgD;
	}

	public float tbinhAm(int[] arSoNguyen) {
		float avgA;
		int dem = 0;
		Bai3mangSN objBai3 = new Bai3mangSN();

		for (int i = 0; i < arSoNguyen.length; i++) {
			if (arSoNguyen[i] < 0) {

				dem++;
			}
		}
		avgA = objBai3.tongDuong(arSoNguyen) / dem;
		return avgA;
	}

	public int chisoDuong(int[] arSoNguyen) {
		int csDuong = arSoNguyen[0];
		try {
			for (int i = 0; i < arSoNguyen.length; i++) {
				if (csDuong < arSoNguyen[i] && arSoNguyen[i] > 0) {
					csDuong = arSoNguyen[i];
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Không có số hạng dương đầu tiên của dãy");
		}

		return csDuong;
	}

	public int chisoAm(int[] arSoNguyen) {
		int csAm = arSoNguyen[0];
		try {
			for (int i = 0; i < arSoNguyen.length; i++) {
				if (csAm > arSoNguyen[i] && arSoNguyen[i] < 0) {
					csAm = arSoNguyen[i];
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Không có số hạng âm cuối cùng của dãy");
		}
		return csAm;
	}

	public int dem(int[] arSoNguyen) {
		int demSo = 0;
		for (int i = 0; i < arSoNguyen.length; i++) {
			if (arSoNguyen[i] > 50) {
				demSo++;
			}
		}
		return demSo;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		do {
			try {
				System.out.println("Mời nhập số phẩn tử trong mảng  số nguyên: ");
				int m = Integer.parseInt(sc.nextLine());
				if (m < 0) {
					throw new Exception("vui lòng nhập số phần tử lớn hơn 0");
				}
				cont = false;
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("vui lòng nhập số nguyên");
			} catch (Exception e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);
		int m = Integer.parseInt(sc.nextLine());
		Bai3mangSN objBai3 = new Bai3mangSN();
		int[] arSoNguyen = objBai3.Nhap(m);
		System.out.println("\nMảng phần tử đã nhập:");
		objBai3.displayData(arSoNguyen);
		System.out.println("\nTổng các phần tử của mảng: " + objBai3.tong(arSoNguyen));
		System.out.println("Tổng phần tử dương của chúng là:" + objBai3.tongDuong(arSoNguyen));
		System.out.println("Tổng phần tử âm của chúng là:" + objBai3.tongAm(arSoNguyen));
		System.out.println("Trung bình cộng các phần tử dương của mảng:" + objBai3.tbinhDuong(arSoNguyen));
		System.out.println("Trung bình cộng các phần tử âm của mảng:" + objBai3.tbinhAm(arSoNguyen));
		System.out.println("Chỉ số của số hạng dương đầu tiên của dãy là:" + objBai3.chisoDuong(arSoNguyen));
		System.out.println("Chỉ số của số hạng âm đầu tiên của dãy là" + objBai3.chisoAm(arSoNguyen));
		System.out.println("Các phần tử có số lớn hơn 50 là:" + objBai3.dem(arSoNguyen));

	}
}
