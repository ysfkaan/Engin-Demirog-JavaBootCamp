package odev2;

public class Instructor extends User {
	
	String classroom;
	String lesson;
	String Category;
	String certificate;
	
	public Instructor(int id, String name, String surname, String gmail, String password, String classroom,
			String lesson, String category, String certificate) {
		super(id, name, surname, gmail, password);
		this.classroom = classroom;
		this.lesson = lesson;
		Category = category;
		this.certificate = certificate;
	}
	

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

}
