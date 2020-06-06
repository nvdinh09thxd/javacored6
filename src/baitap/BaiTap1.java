package baitap;

import java.util.Random;

public class BaiTap1 {
	static Random rd = new Random();

	//Nhập mảng là các số ngẫu nhiên
	public static int[] inputData() {
		int[] arrInt = new int[20];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = rd.nextInt(100);
		}
		return arrInt;
	}

	//Hiển thị mảng ra màn hình
	public static void displayData(int[] arrInt) {
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println("Phan tu thu " + (i + 1) + ": " + arrInt[i]);
		}
	}

	//Tính tổng mảng
	public static int tinhTongMang(int[] arrInt) {
		int s = 0;
		for (int item : arrInt) {
			s += item;
		}
		return s;
	}

	//Tính tổng số chẵn
	public static int tinhTongSoChan(int[] arrInt) {
		int s = 0;
		for (int item : arrInt) {
			if (item % 2 == 0)
				s += item;
		}
		return s;
	}

	//Tính trung bình cộng số lẻ
	public static float tinhTrungBinhCongLe(int[] arrInt) {
		int s = 0, n = 0;
		for (int item : arrInt) {
			if (item % 2 != 0) {
				s += item;
				n++;
			}
		}
		if (n == 0)
			return 0.0f;
		return (float) s / n;
	}

	//Tìm giá trị lớn nhất trong mảng
	public static int timMax(int[] arrInt) {
		int max = arrInt[0];
		for (int item : arrInt) {
			if (item > max)
				max = item;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arrInt = inputData();
		displayData(arrInt);
		System.out.println("Tong cac so trong mang: " + tinhTongMang(arrInt));
		System.out.println("Tong cac phan tu so chan trong mang: " + tinhTongSoChan(arrInt));
		System.out.println("Trung binh cong cac so le trong mang: " + tinhTrungBinhCongLe(arrInt));
		System.out.println("So lon nhat trong mang: " + timMax(arrInt));
	}

}
