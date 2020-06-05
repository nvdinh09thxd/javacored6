package ex_dung;

import java.util.Scanner;

import ex_dung.NumberException;

public class Bai3 {

	// Nhập các phần tử trong mảng
	public static void input(int[] arSoNguyen) {
		Scanner input = new Scanner(System.in);
		System.out.print("========== NHẬP PHẦN TỬ TRONG MẢNG ==========\n");
		for (int i = 0; i < arSoNguyen.length; i++) {
			boolean cont = false;
			do {
				try {
					System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
					arSoNguyen[i] = Integer.parseInt(input.nextLine());
					if (arSoNguyen[i] <= -100) {
						throw new NumberException("Vui lòng nhập vào 1 số > -100");
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

	// Xuất các phần tử trong mảng
	public static void display(int[] arSoNguyen) {
		System.out.println("========== CÁC PHẦN TỬ TRONG MẢNG ==========");
		for (int num : arSoNguyen) {
			System.out.print(num + " ");
		}
	}

	// Tổng các phần tử trong mảng
	public static int tong(int[] arSoNguyen) {
		int sum = 0;
		for (int num : arSoNguyen) {
			sum += num;
		}
		return sum;
	}

	// Số lượng các phần tử > 0 và tổng của chúng
	public static void phanTuDuong(int[] arSoNguyen) {
		int demSoDuong = 0, sumSoDuong = 0;
		for (int num : arSoNguyen) {
			if (num > 0) {
				demSoDuong++;
				sumSoDuong += num;
			}
		}
		System.out.println("Có " + demSoDuong + " số dương trong mảng");
		System.out.println("Tổng của các số dương trong mảng: " + sumSoDuong);
	}

	// Số lượng các phần tử < 0 và tổng của chúng
	public static void phanTuAm(int[] arSoNguyen) {
		int demSoAm = 0, sumSoAm = 0;
		for (int num : arSoNguyen) {
			if (num < 0) {
				demSoAm++;
				sumSoAm += num;
			}
		}
		System.out.println("Có " + demSoAm + " số âm trong mảng");
		System.out.println("Tổng của các số âm trong mảng: " + sumSoAm);
	}

	// Trung bình cộng các phần tử dương trong mảng
	public static float trungBinhCongDuong(int[] arSoNguyen) {
		int demSoDuong = 0, sumSoDuong = 0;
		for (int num : arSoNguyen) {
			if (num > 0) {
				demSoDuong++;
				sumSoDuong += num;
			}
		}
		return (float) sumSoDuong / (float) demSoDuong;
	}

	// Trung bình cộng các phần tử âm trong mảng
	public static float trungBinhCongAm(int[] arSoNguyen) {
		int demSoAm = 0, sumSoAm = 0;
		for (int num : arSoNguyen) {
			if (num < 0) {
				demSoAm++;
				sumSoAm += num;
			}
		}
		return (float) sumSoAm / (float) demSoAm;
	}

	// Chỉ số của số hạng dương đầu tiên của dãy
	public static void soDuongDauTien(int[] arSoNguyen) {
		for (int i = 1; i <= arSoNguyen.length; i++) {
			if (arSoNguyen[i - 1] > 0) {
				System.out.println("Phần tử thứ " + i + " là số dương đầu tiên của dãy");
				return;
			}
		}
	}

	// Chỉ số của số hạng âm cuối cùng của dãy
	public static void soAmCuoiCung(int[] arSoNguyen) {
		for (int i = arSoNguyen.length - 1; i >= 0; i--) {
			if (arSoNguyen[i] < 0) {
				System.out.println("Phần tử thứ " + (i + 1) + " là số âm cuối cùng của dãy");
				return;
			}
		}
	}

	// Đếm số > 50
	public static int demSoLonHon50(int[] arSoNguyen) {
		int dem = 0;
		for (int num : arSoNguyen) {
			if (num > 50) {
				dem++;
			}
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = 0;
		boolean cont = false;
		do {
			try {
				System.out.print("Nhập số lượng phần tử trong mảng: ");
				m = Integer.parseInt(input.nextLine());
				if (m < 0) {
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
		int[] arSoNguyen = new int[m];
		input(arSoNguyen);
		display(arSoNguyen);
		System.out.println("\nTổng các phần tử trong mảng: " + tong(arSoNguyen));
		phanTuDuong(arSoNguyen);
		phanTuAm(arSoNguyen);
		System.out.println("Trung bình cộng các phần tử dương trong mảng: " + trungBinhCongDuong(arSoNguyen));
		System.out.println("Trung bình cộng các phần tử âm trong mảng: " + trungBinhCongAm(arSoNguyen));
		soDuongDauTien(arSoNguyen);
		soAmCuoiCung(arSoNguyen);
		System.out.println("Có " + demSoLonHon50(arSoNguyen) + " số trong mảng > 50");

	}

}
