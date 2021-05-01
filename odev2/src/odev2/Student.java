package odev2;

public class Student extends User{
	
	String Course;
	int finishpoint;
	
	
	
	public Student(int id, String name, String surname, String gmail, String password, String course, int finishpoint) {
		super(id, name, surname, gmail, password);
		Course = course;
		this.finishpoint = finishpoint;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public int getFinishpoint() {
		return finishpoint;
	}

	public void setFinishpoint(int finishpoint) {
		this.finishpoint = finishpoint;
	}

}
