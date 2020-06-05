package pk1;

public class Ex03 {

	public static void main(String[] args) {
		// Tao mang cac thu trong tuan
		int[] arThu = new int[7];
		int[] arThu02 = { 2, 3, 4, 5, 6, 7, 8 };
		for (int thu : arThu02) {
			if (thu == 8) {
				System.out.println("Chu nhat");
			} else {
				System.out.println("Thu " + thu);
			}
		}
	}
}
