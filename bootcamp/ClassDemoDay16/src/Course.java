
public class Course implements Printable {
	
	private int id;
	private String name;

	public Course(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String print() {
		return "Course ID:  "+id+"\n"+
			   "Name:       "+name;
	}

}
