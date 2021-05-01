package odev2;

public class UserManager {
	public void changeName(User user,String newname) {
		user.setName(newname);
		System.out.println("name "+user.getName());
		
	}
	public void changeSurName(User user,String newsurname) {
		user.setName(newsurname);
		System.out.println("Surname "+user.getSurname());
		
	}
	public void changePassword(User user,String newpassword) {
		user.setName(newpassword);
		System.out.println("password "+user.getPassword());
		
	}
	public void changeGmail(User user,String newgmail) {
		user.setName(newgmail);
		System.out.println("Gmail "+user.getGmail());
		
	}
	public void name(User user) {
		System.out.println("name:"+ user.getName());
		
	}
	public void surname(User user) {
		System.out.println("Surname:"+ user.getSurname());
		
	}
	public void password(User user) {
		System.out.println("Password:"+ user.getPassword());
		
	}
	public void gmail(User user) {
		System.out.println("Gmail:"+ user.getGmail());
		
	}
	
}
