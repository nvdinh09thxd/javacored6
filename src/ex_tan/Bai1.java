package ex_tan;

import java.util.Random;

public class Bai1 {
	public int[] Nhap() {
		int[] arSo = new int[20];
		Random rd = new Random();
		for (int i = 0; i < arSo.length; i++) {
			arSo[i] = rd.nextInt(19);
		}
		return arSo;
	}

	public void disPlay(int[] arSo) {
		System.out.println("Mảng là:");
		for (int i = 0; i < arSo.length; i++) {
			System.out.print(arSo[i] + "\t");
		}
	}

	public int tong(int[] arSo) {
		int sum = 0;
		for (int i = 0; i < arSo.length; i++) {
			sum += arSo[i];
		}
		return sum;
	}

	public int tongChan(int[] arSo) {
		int sumc = 0;
		for (int i = 0; i < arSo.length; i++) {
			if (arSo[i] % 2 == 0) {
				sumc += arSo[i];
			}
		}

		return sumc;
	}

	public float tbinhLe(int[] arSo) {
		float avg, sumLe = 0;
		int dem = 0;
		for (int i = 0; i < arSo.length; i++) {
			if (arSo[i] % 2 != 0) {
				sumLe += arSo[i];
				dem++;
			}
		}
		avg = (sumLe / dem);
		return avg;
	}

	public int max(int[] arSo) {
		int max = arSo[0];
		for (int i = 0; i < arSo.length; i++) {
			if (max < arSo[i]) {
				max = arSo[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Bai1 objBai1 = new Bai1();
		int[] arSo = objBai1.Nhap();
		System.out.println("------Mảng vừa tạo-------");
		objBai1.disPlay(arSo);
		// int tongSo=objBai1.tong(arSo);tạo hàm mới
		System.out.println("\nTổng mảng là:" + objBai1.tong(arSo));
		System.out.println("\nTổng các số chẵn trong mảng là:" + objBai1.tongChan(arSo));
		System.out.println("\nTrung bình cộng các số lẻ trong mảng là:" + objBai1.tbinhLe(arSo));
		System.out.println("\nMax trong mảng là:" + objBai1.max(arSo));

	}
}
