package odev1;


public class main {

	public static void main(String[] args) {
		
		Trainer trainer1=new Trainer(1,"Engin Demirog","Yaz�l�m geli�tirme");
		
		Course course1 =new Course(1 ,"C#","8 hafta","Yaz�l�m Geli�tirme");
		Course course2 =new Course(2 ,"Java","8 hafta","Yaz�l�m Geli�tirme");
		Course course3 =new Course(3 ,"Programlamaya giri�","8 hafta","Yaz�l�m Geli�tirme");
		
		
		
		Course[] courses = {course1,course2,course3};
		for (Course course :courses) {
			System.out.println("kursun ismi:"+ course.name +
					" \nkursun s�resi:"+ course.duration+
					"\nE�itmen:"+trainer1.name+
					"\nE�itim kategorisi:"+course.category);
			
			
			
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
