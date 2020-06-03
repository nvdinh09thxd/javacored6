package actions;

import java.util.Scanner;

import bean.SinhVien2;

public class SinhVienAction {
	public static SinhVien2 inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		String address = sc.nextLine();
		System.out.print("Nhap truong: ");
		String school = sc.nextLine();
		SinhVien2 sv = new SinhVien2(name, address, school);
		return sv;
	}

	public static SinhVien2[] input(int n) {
		SinhVien2[] arSV = new SinhVien2[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arSV.length; i++) {
			System.out.print("Nhap ho ten: ");
			String name = sc.nextLine();
			System.out.print("Nhap dia chi: ");
			String address = sc.nextLine();
			System.out.print("Nhap truong: ");
			String school = sc.nextLine();
			SinhVien2 objSV = new SinhVien2(name, address, school);
			arSV[i] = objSV;
		}
		return arSV;
	}

	public static void displayData(SinhVien2 sv) {
		// System.out.println("Ho ten: " + sv.getName());
		// System.out.println("Dia chi: " + sv.getAddress());
		// System.out.println("Truong: " + sv.getSchool());
		System.out.println(sv.toString());
	}

	public static void display(SinhVien2[] arSV) {
		System.out.println("Danh sach cac sinh vien");
		for (SinhVien2 sv : arSV) {
			System.out.println("Ho ten: " + sv.getName());
			System.out.println("Dia chi: " + sv.getAddress());
			System.out.println("Truong: " + sv.getSchool());
		}
	}
}
