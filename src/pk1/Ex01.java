package pk1;

public class Ex01 {
	public static void main(String[] args) {
		// b1. xác định kiểu dữ liệu của mảng
		// khởi tạo mảng (có 5 phần tử)
		String[] arSinhVien = new String[5];
		// gán giá trị cho các phần tử mảng
		arSinhVien[0] = "Nguyễn Văn A";
		arSinhVien[1] = "Trần Thị B";
		arSinhVien[2] = "Nguyễn Ngọc Lan";
		arSinhVien[3] = "Lê Anh Đào";
		arSinhVien[4] = "Thái Thị Thương";
		// in ra phần tử của mảng
		System.out.println("Phần tử thứ 5 có giá trị là: " + arSinhVien[4]);
		System.out.println("Phần tử thứ 2 có giá trị là: " + arSinhVien[1]);
		// Gán giá trị
		arSinhVien[0] = "Trần Văn A";
		System.out.println("Phần tử thứ 1 có giá trị là: " + arSinhVien[0]);

		// Xóa phần tử
		// 1. Mảng CHỨA PHẦN TỬ CỐ ĐỊNH (Không thêm, không xóa được)
		// foreach: chuyên dùng cho mảng
		System.out.println("<<Foreach>>");
		for (String sv : arSinhVien) {
			System.out.println("Họ tên sinh viên: " + sv);
		}
		System.out.println("<<For i>>");
		for (int i = 0; i < arSinhVien.length; i++) {
			String sv = arSinhVien[i];
			System.out.println("Họ tên sinh viên: " + sv);
		}
	}
}
