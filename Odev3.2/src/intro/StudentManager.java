package intro;

public class StudentManager extends UserManager{
	
	@Override
	public void toSystem(User user) {
		System.out.println("Sisteme ��renci olarak kay�t ger�ekle�tirildi: "+user.getFullName());
	}
	
	public void addtoCourse(Student user) {
		System.out.println("Kursa kay�t ger�ekle�tirildi: "+user.getCourseName());
	}
	
	public void deltoCourse(User user) {
		System.out.println("Kurs silindi.");
	}
	
	public void finaltoLesson(User user) {
		System.out.println("Dersi tamamlad�n�z.");
	}


	
	


}
