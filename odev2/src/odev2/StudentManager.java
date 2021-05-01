package odev2;

public class StudentManager {
	public void addHomework(Student student ,String homeWork) {
		System.out.println(student.name+" öðrencinin ödevi "+homeWork);
	}
	public void finishpoint(Student student) {
		System.out.println(student.name+ " öðrencinin puaný " +student.finishpoint);
		
	}
	public void changeCourse(Student student,String newCourse) {
		student.setCourse(newCourse);
		System.out.println("öðrencinin kursu "+student.getCourse());
	}
		
}
