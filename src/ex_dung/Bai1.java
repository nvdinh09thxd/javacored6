package ex_dung;

import java.util.Random;

public class Bai1 {

	// Nhập các phần tử trong mảng
	public static void random(int[] arrNumber) {
		Random rd = new Random();
		for (int i = 0; i < arrNumber.length; i++) {
			arrNumber[i] = rd.nextInt(100);
		}
	}

	// Tổng các số trong mảng
	public static int tong(int[] arrNumber) {
		int sum = 0;
		for (int num : arrNumber) {
			sum += num;
		}
		return sum;
	}

	// Tổng các số chẵn trong mảng
	public static int tongChan(int[] arrNumber) {
		int sumChan = 0;
		for (int num : arrNumber) {
			if (num % 2 == 0) {
				sumChan += num;
			}
		}
		return sumChan;
	}

	// Trung bình cộng các số lẻ trong mảng
	public static float trungBinhCongLe(int[] arrNumber) {
		int sumLe = 0, soLuongSoLe = 0;
		for (int num : arrNumber) {
			if (num % 2 != 0) {
				soLuongSoLe++;
				sumLe += num;
			}
		}
		float trungBinhCongLe = (float) sumLe / (float) soLuongSoLe;
		return trungBinhCongLe;
	}

	// Tìm số max trong mảng
	public static int max(int[] arrNumber) {
		int max = 0;
		for (int num : arrNumber) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arrNumber = new int[20];
		random(arrNumber);
		System.out.println("======== Phần tử trong mảng ========");
		for (int num : arrNumber) {
			System.out.print(num + " ");
		}
		System.out.println("\nTổng các phần tử trong mảng: " + tong(arrNumber));
		System.out.println("Tổng các số chẵn trong mảng: " + tongChan(arrNumber));
		System.out.println("Trung bình cộng các số lẻ trong mảng: " + trungBinhCongLe(arrNumber));
		System.out.println("Số lớn nhất trong mảng: " + max(arrNumber));

	}

}
