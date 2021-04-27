package odev1;


public class main {

	public static void main(String[] args) {
		
		Trainer trainer1=new Trainer(1,"Engin Demirog","Yazýlým geliþtirme");
		
		Course course1 =new Course(1 ,"C#","8 hafta","Yazýlým Geliþtirme");
		Course course2 =new Course(2 ,"Java","8 hafta","Yazýlým Geliþtirme");
		Course course3 =new Course(3 ,"Programlamaya giriþ","8 hafta","Yazýlým Geliþtirme");
		
		
		
		Course[] courses = {course1,course2,course3};
		for (Course course :courses) {
			System.out.println("kursun ismi:"+ course.name +
					" \nkursun süresi:"+ course.duration+
					"\nEðitmen:"+trainer1.name+
					"\nEðitim kategorisi:"+course.category);
			
			
			
		}
		ClassManager classmanager=new ClassManager();
		classmanager.addToLesson(course1);
		classmanager.addToLesson(course2);
		classmanager.addToLesson(course3);
	
		ClassManager classdeletemanager=new ClassManager();
		classdeletemanager.deleteToLesson(course1);
		classdeletemanager.deleteToLesson(course2);
		classdeletemanager.deleteToLesson(course3);
		
		
	}

}
