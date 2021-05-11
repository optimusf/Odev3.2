package intro;

public class InstructorManager extends UserManager {
	
	@Override
	public void toSystem(User user) {
		System.out.println("Sisteme eðitmen olarak kayýt gerçekleþtirildi: "+user.getFullName());
	}
	
	public void createtoCourse(Instructor user) {
		System.out.println("Ýstenilen kurs oluþturuldu:" + user.getCourse());
	}
	
	public void rollcall(User user) {
		System.out.println("Yoklama alýndý.");
	}
	
	



}
