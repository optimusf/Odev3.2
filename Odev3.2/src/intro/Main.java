package intro;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Fatmagül Dursun", "drsnfatmagul@gmail.com", "12345");
		
		Student student1 = new Student("xx yy","xxxxx","11111","1", "Java REACT");
		
		Instructor instructor1 = new Instructor("Engin Demiroğ","x","00000","Java");
		
		UserManager usermanager = new UserManager();
		
		usermanager.toSystem(user1);
		
		InstructorManager instructormanager = new InstructorManager();
		
		instructormanager.toSystem(instructor1);
		instructormanager.createtoCourse(instructor1);
		instructormanager.rollcall(instructor1);
		
		StudentManager studentmanager = new StudentManager();
		
		studentmanager.toSystem(student1);
		studentmanager.addtoCourse(student1);
		studentmanager.deltoCourse(student1);
		studentmanager.finaltoLesson(student1);
		
		
		

	}

}
