package bean;

public class SinhVien {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SinhVien(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public SinhVien() {
		super();
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\tAge: " + this.age;
	}

}
