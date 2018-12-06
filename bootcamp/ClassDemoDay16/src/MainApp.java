
public class MainApp {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		Student student1 = new Student (1, "Nick", "Law");
		System.out.println(student1.print());
		System.out.println();
		Course course1 = new Course (1, "Java");
		System.out.println(course1.print());
		
		
		
		System.out.println("Goodbye");
	}

}
