package pk1;

import bean.SinhVien;

public class Ex02 {

	public static void main(String[] args) {
		SinhVien[] arSV = new SinhVien[3];
		// Gan gia tri cho sinh vien thu 1
		arSV[0] = new SinhVien("Lan Anh", 25);
		// Gan gia tri cho sinh vien thu 2
		SinhVien sv02 = new SinhVien("Nguyen Yen Vi", 24);
		arSV[1] = sv02;
		// Gan gia tri cho sinh vien thu 3
		SinhVien sv03 = new SinhVien();
		sv03.setAge(26);
		sv03.setName("Thu Lan");
		arSV[2] = sv03;
		System.out.println("Danh sach sinh vien");
		//Tim file: ctrl + shift + r
		for (SinhVien sinhVien : arSV) {
			System.out.println(sinhVien);
		}
	}

}
