package ex_tan.bt3;

import java.util.Scanner;

import baitap.NumberException;

public class Bai3mangSN {
	public static int[] Nhap(int[] arSoNguyen) {
		Scanner sc = new Scanner(System.in);
		boolean cont = false;
		for (int i = 0; i < arSoNguyen.length; i++) {

			do {
				try {
					cont = false;
					System.out.println("Nhập phần tử thứ " + (i + 1) + " là:");
					arSoNguyen[i] = Integer.parseInt(sc.nextLine());
					if (arSoNguyen[i] <= -100) {
						throw new NumberException("Vui lòng nhập số > -100");
					}
					cont = false;
				} catch (NumberFormatException e) {
					cont = true;
					System.out.println("Vui lòng nhấp phần tử là số");
				} catch (NumberException e) {
					cont = true;
					System.out.println(e.getMessage());
				}

			} while (cont);

		}

		return arSoNguyen;
	}

	public static void displayData(int[] arSoNguyen) {
		System.out.println("---Mảng Số Nguyên---");
		for (int num : arSoNguyen) {
			System.out.print(num + "\t");
		}
	}

	public static int tong(int[] arSoNguyen) {
		int sum = 0;
		for (int i = 0; i < arSoNguyen.length; i++) {
			sum += arSoNguyen[i];
		}
		return sum;
	}

	public static int demSoDuong(int[] arSoNguyen) {
		int dem = 0;
		for (int i : arSoNguyen) {
			if (i > 0) {
				dem++;
			}
		}
		return dem;
	}

	public static int tongSoDuong(int[] arSoNguyen) {
		int sum = 0;
		for (int i : arSoNguyen) {
			if (i > 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static int demSoAm(int[] arSoNguyen) {
		int dem = 0;
		for (int i : arSoNguyen) {
			if (i < 0) {
				dem++;
			}
		}
		return dem;
	}

	public static int tongSoAm(int[] arSoNguyen) {
		int sum = 0;
		for (int i : arSoNguyen) {
			if (i < 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static float tbinhDuong(int[] arSoNguyen) {
		if (demSoDuong(arSoNguyen) == 0) {
			return 0.0f;
		} else {
			return (float) tongSoDuong(arSoNguyen) / (float) demSoDuong(arSoNguyen);
		}
	}

	public static float tbinhAm(int[] arSoNguyen) {
		if (demSoAm(arSoNguyen) == 0) {
			return 0.0f;
		} else {
			return (float) tongSoAm(arSoNguyen) / (float) demSoAm(arSoNguyen);
		}
	}

	public static int chisoDuong(int[] arSoNguyen) {
		for (int i = 0; i < arSoNguyen.length; i++) {
			if (arSoNguyen[i] > 0) {
				return i + 1;
			}
		}
		return -1;
	}

	public static int chisoAm(int[] arSoNguyen) {
		for (int i = arSoNguyen.length - 1; i >= 0; i--) {
			if (arSoNguyen[i] < 0) {
				return i + 1;
			}
		}
		return -1;
	}

	public static int demSoLonHon50(int[] arSoNguyen) {
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
		int m = 0;
		do {
			try {
				System.out.println("Mời nhập số phẩn tử trong mảng  số nguyên: ");
				m = Integer.parseInt(sc.nextLine());
				if (m < 0) {
					throw new NumberException("vui lòng nhập số phần tử lớn hơn 0");
				}
				cont = false;
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("vui lòng nhập số nguyên");
			} catch (NumberException e) {
				cont = true;
				System.out.println(e.getMessage());
			}
		} while (cont);
		
		int[] arSoNguyen = new int[m];
		arSoNguyen = Nhap(arSoNguyen);
		displayData(arSoNguyen);
		System.out.println("\nTổng các phần tử của mảng: " + tong(arSoNguyen));
		System.out.println("Tổng phần tử dương của chúng là:" + tongSoDuong(arSoNguyen));
		System.out.println("Tổng phần tử âm của chúng là:" + tongSoAm(arSoNguyen));
		
		System.out.println("Trung bình cộng các phần tử dương của mảng:" + tbinhDuong(arSoNguyen));
		
		System.out.println("Trung bình cộng các phần tử âm của mảng:" + tbinhAm(arSoNguyen));
		if (chisoDuong(arSoNguyen) == -1) {
			System.out.println("Trong mảng không có số dương");
		} else {
			System.out.println("Chỉ số của số hạng dương đầu tiên của dãy là:" + chisoDuong(arSoNguyen));
		}
		if (chisoAm(arSoNguyen) == -1) {
			System.out.println("Trong mảng không có số âm");
		} else {
			System.out.println("Chỉ số của số hạng âm đầu tiên của dãy là" + chisoAm(arSoNguyen));
		}
		System.out.println("Các phần tử có số lớn hơn 50 là:" + demSoLonHon50(arSoNguyen));

	}
}
