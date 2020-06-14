package bt_video;

public class News {
	private int id;
	private String name;
	private String dateCreate;

	public News() {
		super();
	}

	public News(int id, String name, String dateCreate) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreate = dateCreate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}

	@Override
	public String toString() {
		return "id: " + id + "\nname: " + name + "\ndateCreate: " + dateCreate;
	}
}
