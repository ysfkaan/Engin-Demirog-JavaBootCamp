package odev1;


public class main {

	public static void main(String[] args) {
		
		Course course1 =new Course(1 ,"C#","8 hafta","Yaz�l�m Geli�tirme","Engin Demirog");
		Course course2 =new Course(2 ,"Java","8 hafta","Yaz�l�m Geli�tirme","Engin Demirog");
		Course course3 =new Course(3 ,"Programlamaya giri�","8 hafta","Yaz�l�m Geli�tirme","Engin Demirog");
		
		
		
		Course[] courses = {course1,course2,course3};
		for (Course course :courses) {
			System.out.println(course.name);
			
		}
		
		
		
		
	}

}
