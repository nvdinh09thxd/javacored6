package baitap;

import java.util.Scanner;

public class BaiTap3 {
	static Scanner sc = new Scanner(System.in);

	public static int[] inputData(int n) {
		int[] arrInt = new int[n];
		boolean check = true;
		for (int i = 0; i < arrInt.length; i++) {
			do {
				try {
					System.out.print("Nhap mot so nguyen lon hon -100: ");
					int number = Integer.parseInt(sc.nextLine());
					if (number <= -100)
						throw new NumberException("Vui long nhap so nguyen lon hon -100!");
					else {
						arrInt[i] = number;
						check = false;
					}
				} catch (NumberFormatException e) {
					System.out.println("Vui long nhap dung dinh dang so!");
				} catch (NumberException e) {
					System.out.println(e.getMessage());
				}
			} while (check);
		}
		return arrInt;
	}

	public static void displayData(int[] arrInt) {
		for (int item : arrInt) {
			System.out.print(" " + item);
		}
		System.out.println();
	}

	public static int tinhTongMang(int[] arrInt) {
		int s = 0;
		for (int item : arrInt) {
			s += item;
		}
		return s;
	}

	public static int soLuongPTDuong(int[] arrInt) {
		int n = 0;
		for (int item : arrInt) {
			if (item > 0) {
				n++;
			}
		}
		return n;
	}

	public static int tongPTDuong(int[] arrInt) {
		int s = 0;
		for (int item : arrInt) {
			if (item > 0) {
				s += item;
			}
		}
		return s;
	}

	public static int chiSoPTDuong(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] > 0)
				return i;
		}
		return -1;
	}

	public static int soLuongPTAm(int[] arrInt) {
		int n = 0;
		for (int item : arrInt) {
			if (item < 0)
				n++;
		}
		return n;
	}

	public static int tongPTAm(int[] arrInt) {
		int s = 0;
		for (int item : arrInt) {
			if (item < 0)
				s += item;
		}
		return s;
	}

	public static int chiSoPTAm(int[] arrInt) {
		int index = -1;
		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] < 0)
				index = i;
		}
		return index;
	}

	public static int soLonHon50(int[] arrInt) {
		int n = 0;
		for (int item : arrInt) {
			if (item > 50)
				n++;
		}
		return n;
	}

	public static void main(String[] args) {
		int m = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhap so phan tu cua mang: ");
				int number = Integer.parseInt(sc.nextLine());
				if (number <= 0)
					throw new NumberException("Vui long nhap so lon hon 0!");
				else {
					m = number;
					check = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap dung dinh dang so!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (check);
		int[] arrSoNguyen = inputData(m);
		System.out.print("Danh sach cac phan tu cua mang:");
		displayData(arrSoNguyen);
		System.out.println("Tong cac phan tu cua mang la: " + tinhTongMang(arrSoNguyen));
		System.out.println("So luong cac phan tu duong la: " + soLuongPTDuong(arrSoNguyen));
		System.out.println("Tong cac phan tu duong la: " + tongPTDuong(arrSoNguyen));
		System.out.println("So luong cac phan tu am la: " + soLuongPTAm(arrSoNguyen));
		System.out.println("Tong cac phan tu am la: " + tongPTAm(arrSoNguyen));
		if (soLuongPTDuong(arrSoNguyen) == 0)
			System.out.println("Trong mang khong co phan tu duong de tinh trung binh cong!");
		else
			System.out.println("Trung binh cong cac phan tu duong cua mang: "
					+ (float) tongPTDuong(arrSoNguyen) / soLuongPTDuong(arrSoNguyen));
		if (soLuongPTAm(arrSoNguyen) == 0)
			System.out.println("Trong mang khong co phan tu am de tinh trung binh cong!");
		else
			System.out.println("Trung binh cong cac phan tu am cua mang: "
					+ (float) tongPTAm(arrSoNguyen) / soLuongPTAm(arrSoNguyen));
		System.out.println("Chi so phan tu duong dau tien cua mang: " + chiSoPTDuong(arrSoNguyen));
		System.out.println("Chi so phan tu am cuoi cung cua mang: " + chiSoPTAm(arrSoNguyen));
		System.out.println("Co " + soLonHon50(arrSoNguyen) + " so lon hon 50");
	}

}
