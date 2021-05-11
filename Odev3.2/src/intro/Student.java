package intro;

public class Student extends User{
	
	private String studentNumber;
	private String courseName;
	
	public Student() {
		
	}

	public Student(String fullName, String email, String password, String studentNumber, String courseName) {
		super(fullName, email, password);
		this.studentNumber = studentNumber;
		this.courseName = courseName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
