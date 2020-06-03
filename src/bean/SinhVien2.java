package bean;

public class SinhVien2 {
	private String name;
	private String address;
	private String school;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public SinhVien2() {
		super();
	}

	public SinhVien2(String name, String address, String school) {
		super();
		this.name = name;
		this.address = address;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\tAddress: " + this.address + "\tSchool: " + this.school;
	}

}
