package bt_video;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ListNews {
	public static ArrayList<News> input() {
		ArrayList<News> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số tin tức: ");
		int n = Integer.parseInt(input.nextLine());

		for (int i = 0; i < n; i++) {
			System.out.print("Tên tin tức: ");
			String name = input.nextLine();

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String dateCreate = sdf.format(new Date());
			News news = new News(i, name, dateCreate);
			list.add(news);
		}

		return list;
	}

	public static void display(ArrayList<News> list) {
		if (list.size() > 0) {
			for (News news : list) {
				System.out.println(news);
			}
		} else {
			System.out.println("chưa có tin tức");
		}
	}

	public static void main(String[] args) {
		ArrayList<News> list = input();
		display(list);
	}
}
