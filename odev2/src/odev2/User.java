package odev2;

public class User {
	int id;
	String name;
	String surname;
	String gmail;
	String password;
	
	public User(int id, String name, String surname, String gmail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.gmail = gmail;
		this.password = password;
		
	}
	
	

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
