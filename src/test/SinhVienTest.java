package test;

import bean.SinhVien2;

import java.util.Scanner;

import actions.SinhVienAction;

public class SinhVienTest {

	public static void main(String[] args) {
		// SinhVien2[] arSV = new SinhVien2[3];
		// for (int i = 0; i < arSV.length; i++) {
		// System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
		// arSV[i] = SinhVienAction.inputData();
		// }
		// for (int i = 0; i < arSV.length; i++) {
		// System.out.println("Xuat thong tin sinh vien thu " + (i + 1));
		// SinhVienAction.displayData(arSV[i]);
		// }

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien: ");
		int n = sc.nextInt();
		SinhVien2[] arSV2 = SinhVienAction.input(n);
		SinhVienAction.display(arSV2);
	}
}
