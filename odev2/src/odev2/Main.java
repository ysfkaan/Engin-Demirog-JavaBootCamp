package odev2;

public class Main {

	public static void main(String[] args) {
		User user =new User(1, "yusuf kaan", "basdemir", "abc@","1234");
	
		UserManager usermanager=new UserManager();
		usermanager.name(user);
		
		usermanager.changeName(user, "Ahmet");
		
		Student student =new Student(1,"yusuf kaan", "ba�demir", "abc@", "1234", "java", 100);
		
		
		StudentManager studentmanager= new StudentManager();
		
		studentmanager.addHomework(student, "java");
		studentmanager.finishpoint(student);
		studentmanager.changeCourse(student, "C++");
		
		
		Instructor instructor =new Instructor(1, "engin", "demirog", "abc@", "1234", "Ak�am 9.30 s�n�f�", "java","yaz�l�m geli�time", "java sertifikas�");
		System.out.println(instructor.getName());
		InstructorManager manager =new InstructorManager();
		manager.addlesson();
		manager.students(student);
		manager.homeworks("class yap�lar�");
		
		

	
	
	}

}
