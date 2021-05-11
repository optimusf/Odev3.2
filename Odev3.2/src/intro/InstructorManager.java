package intro;

public class InstructorManager extends UserManager {
	
	@Override
	public void toSystem(User user) {
		System.out.println("Sisteme e�itmen olarak kay�t ger�ekle�tirildi: "+user.getFullName());
	}
	
	public void createtoCourse(Instructor user) {
		System.out.println("�stenilen kurs olu�turuldu:" + user.getCourse());
	}
	
	public void rollcall(User user) {
		System.out.println("Yoklama al�nd�.");
	}
	
	



}
