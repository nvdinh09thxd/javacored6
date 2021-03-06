package baitap;

import java.util.Scanner;

public class BaiTap2 {
	static Scanner sc = new Scanner(System.in);

	public static int[] inputData(int n) {
		int[] arrInt = new int[n];
		for (int i = 0; i < arrInt.length; i++) {
			boolean check = true;
			do {
				try {
					System.out.print("Nhap so nguyen tu 21 den 99: ");
					arrInt[i] = Integer.parseInt(sc.nextLine());
					if (arrInt[i] >= 100 || arrInt[i] <= 20)
						throw new NumberException("Vui long nhap so tu 21 den 99!");
					else
						check = false;
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
		if (arrInt.length == 0)
			System.out.println("Mảng rỗng!");
		else {
			System.out.println("Danh sach cac so vua nhap la:");
			for (int i = 0; i < arrInt.length; i++) {
				System.out.println("Phan tu thu " + (i + 1) + ": " + arrInt[i]);
			}
		}
	}

	public static int demSoChiaHet5(int[] arrInt) {
		int n = 0;
		for (int i : arrInt) {
			if (i % 5 == 0)
				n++;
		}
		return n;
	}

	public static int demSoChiaHet34(int[] arrInt) {
		int n = 0;
		for (int i : arrInt) {
			if (i % 3 == 0 && i % 4 == 0)
				n++;
		}
		return n;
	}

	public static void main(String[] args) {
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhap so phan tu cua mang: ");
				n = Integer.parseInt(sc.nextLine());
				if (n < 0)
					throw new NumberException("Vui long nhap so lon hon hoac bang 0!");
				else
					check = false;
			} catch (NumberFormatException e) {
				System.out.println("Vui long nhap dung dinh dang so!");
			} catch (NumberException e) {
				System.out.println(e.getMessage());
			}
		} while (check);
		int[] arrInt = inputData(n);
		displayData(arrInt);
		if (arrInt.length > 0) {
			System.out.println("Co " + demSoChiaHet5(arrInt) + " so chia het cho 5");
			System.out.println("Co " + demSoChiaHet34(arrInt) + " so vua chia het cho 3 vua chia het cho 4");
		}
	}

}
