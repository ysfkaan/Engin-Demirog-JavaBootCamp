package odev2;

public class StudentManager {
	public void addHomework(Student student ,String homeWork) {
		System.out.println(student.name+" ��rencinin �devi "+homeWork);
	}
	public void finishpoint(Student student) {
		System.out.println(student.name+ " ��rencinin puan� " +student.finishpoint);
		
	}
	public void changeCourse(Student student,String newCourse) {
		student.setCourse(newCourse);
		System.out.println("��rencinin kursu "+student.getCourse());
	}
		
}
