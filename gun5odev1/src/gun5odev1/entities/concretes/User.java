package gun5odev1.entities.concretes;

public class User {
	private int id;
	private String name ;
	private String surname;
	private String Birthday;
	private String adress;
	private String mail;
	private String password;
	
	
	public User(int id, String name, String surname, String birthday, String adress, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		Birthday = birthday;
		this.adress = adress;
		this.mail = mail;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getBirthday() {
		return Birthday;
	}


	public void setBirthday(String birthday) {
		Birthday = birthday;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
