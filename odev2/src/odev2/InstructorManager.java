package odev2;

public class InstructorManager {
	public void homeworks(String homework) {
		System.out.println(homework+ " ödevi verildi");
	}
	
	public void students (Student student) {
		System.out.println("yoklamada olan öðrenciler "+student.name);
	}
	
	public void addlesson() {
		System.out.println("ders eklendi");
	}
}
