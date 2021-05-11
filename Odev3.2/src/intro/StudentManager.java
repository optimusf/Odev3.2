package intro;

public class StudentManager extends UserManager{
	
	@Override
	public void toSystem(User user) {
		System.out.println("Sisteme öğrenci olarak kayıt gerçekleştirildi: "+user.getFullName());
	}
	
	public void addtoCourse(Student user) {
		System.out.println("Kursa kayıt gerçekleştirildi: "+user.getCourseName());
	}
	
	public void deltoCourse(User user) {
		System.out.println("Kurs silindi.");
	}
	
	public void finaltoLesson(User user) {
		System.out.println("Dersi tamamladınız.");
	}


	
	


}
