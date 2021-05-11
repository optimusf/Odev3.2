package intro;

public class Instructor extends User{
	
	private String courses;
	
	public Instructor() {
		
	}

	public Instructor(String fullName, String email, String password, String courses) {
		super(fullName, email, password);
		this.courses = courses;
	}

	public String getCourse() {
		return courses;
	}

	public void setCourse(String course) {
		this.courses = course;
	}

}
