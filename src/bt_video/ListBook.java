package bt_video;

import java.util.ArrayList;
import java.util.Scanner;

public class ListBook {
	public static ArrayList<Book> input() {
		ArrayList<Book> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("số sách cần nhập: ");
		int n = Integer.parseInt(input.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.println("Tên sách: ");
			String name = input.nextLine();
			System.out.println("Năm xuất bản: ");
			int year = Integer.parseInt(input.nextLine());
			Book book = new Book(i, name, year);
			list.add(book);
		}
		return list;
	}

	public static void display(ArrayList<Book> list) {
		if (list.size() > 0) {
			for (Book book : list) {
				System.out.println(book);
			}
		} else {
			System.out.println("chưa có sách nào!");
		}
	}

	public static void seach(ArrayList<Book> list) {
		Scanner input = new Scanner(System.in);
		System.out.println("================Tìm kiếm sách=================");
		System.out.println("Nhâp ID: ");
		int id = Integer.parseInt(input.nextLine());

		for (Book book : list) {
			if (book.getId() == id) {
				System.out.println(book);
				return;
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Book> list = input();
		display(list);
		seach(list);
	}
}
